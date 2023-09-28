return {
  {
    "neovim/nvim-lspconfig",
    ft = { "java" },
    opts = {
      setup = {
        -- stylua: ignore
        jdtls = function() return true end,
      },
    },
  },
  {
    "mfussenegger/nvim-jdtls",
    -- stylua: ignore
    -- cond = function() return not vim.o.diff end,
    ft = "java",
    config = function()
      ---
      local on_attach = function(client, bufnr)
        require("jdtls").setup_dap()
        require("lazyvim.plugins.lsp.keymaps").on_attach(client, bufnr)
      end

      local capabilities = require("cmp_nvim_lsp").default_capabilities()
      local project_name = vim.fn.fnamemodify(vim.fn.getcwd(), ":p:h:t")
      -- calculate workspace dir
      local workspace_dir = "/home/ocsiker/Alpha/sourceCode/java/" .. "/site/java/workspace-root/" .. project_name

      -- get the current OS
      local os
      if vim.fn.has("mac") == 1 then
        os = "mac"
      elseif vim.fn.has("unix") == 1 then
        os = "linux"
      elseif vim.fn.has("win32") == 1 then
        os = "win"
      end
      -- get the mason install path
      local install_path = require("mason-registry").get_package("jdtls"):get_install_path()
      -- local debug_install_path = require("mason-registry").get_package("java-debug-adapter"):get_install_path()
      local config = {
        cmd = {
          "java",
          "-Declipse.application=org.eclipse.jdt.ls.core.id1",
          "-Dosgi.bundles.defaultStartLevel=4",
          "-Declipse.product=org.eclipse.jdt.ls.core.product",
          "-Dlog.protocol=true",
          "-Dlog.level=ALL",
          "-javaagent:" .. install_path .. "/lombok.jar",
          "-Xms1g",
          "--add-modules=ALL-SYSTEM",
          "--add-opens",
          "java.base/java.util=ALL-UNNAMED",
          "--add-opens",
          "java.base/java.lang=ALL-UNNAMED",
          "-jar",
          vim.fn.glob(install_path .. "/plugins/org.eclipse.equinox.launcher_*.jar"),
          "-configuration",
          install_path .. "/config_" .. os,
          "-data",
          workspace_dir,
        },
        on_attach = on_attach,
        capabilities = capabilities,
        root_dir = vim.fs.dirname(
          vim.fs.find({ ".gradlew", ".git", "mvnw", "pom.xml", "build.gradle" }, { upward = true })[1]
        ),
        settings = {
          java = {},
        },
        init_options = {
          bundles = {
            vim.fn.glob(
              require("mason-registry").get_package("java-debug-adapter"):get_install_path()
              .. "/extension/server/com.microsoft.java.debug.plugin-*.jar"
            ),
            -- unpack remaining bundles
            (table.unpack or unpack)(
                  vim.split(
                    vim.fn.glob(
                      require("mason-registry").get_package("java-test"):get_install_path() .. "/extension/server/*.jar"
                    ),
                    "\n",
                    {}
                  )
                ),
          },
        },
        filetypes = { "java" },
        vim.cmd([[
          command! -buffer -nargs=? -complete=custom,v:lua.require'jdtls'._complete_compile JdtCompile lua require('jdtls').compile(<f-args>)
command! -buffer -nargs=? -complete=custom,v:lua.require'jdtls'._complete_set_runtime JdtSetRuntime lua require('jdtls').set_runtime(<f-args>)
command! -buffer JdtUpdateConfig lua require('jdtls').update_project_config()
command! -buffer JdtJol lua require('jdtls').jol()
command! -buffer JdtBytecode lua require('jdtls').javap()
command! -buffer JdtJshell lua require('jdtls').jshell()
]]),
      }
      ---
      vim.api.nvim_create_autocmd("FileType", {
        pattern = "java",
        callback = function()
          local jdtls = require("jdtls")
          local wk = require("which-key")
          local bufnr = vim.api.nvim_get_current_buf()

          -- stylua: ignore start
          local extract_variable = function() jdtls.extract_variable(true) end
          local extract_method = function() jdtls.extract_method(true) end
          -- stylua: ignore end

          wk.register({
            ["<leader>cJ"] = { name = "+java", buffer = bufnr, mode = { "n", "v" } },
          })

          wk.register({
            i = { jdtls.organize_importsorganize_imports, "Organize imports" },
            t = { jdtls.test_class, "Test class" },
            n = { jdtls.test_nearest_method, "Test nearest method" },
            e = { extract_variable, "Extract variable" },
            M = { extract_method, "Extract method" },
          }, {
            prefix = "<leader>cJ",
            buffer = bufnr,
          })

          wk.register({
            e = { extract_variable, "Extract variable" },
            M = { extract_method, "Extract method" },
          }, {
            mode = "v",
            prefix = "<leader>cJ",
            buffer = bufnr,
          })

          jdtls.setup_dap({ hotcodereplace = "auto" })
          -- jdtls.start_or_attach({
          -- cmd = { "jdtls" },
          -- settings = {
          --   java = {},
          -- },
          -- root_dir = jdtls.setup.find_root({ ".git", "mvnw", "gradlew", "build.gradle" }),
          -- })
          jdtls.start_or_attach(config)
        end,
      })

      return true
    end,
  },
}

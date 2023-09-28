return {
  {
    "tpope/vim-dadbod",
    dependencies = {
      "kristijanhusak/vim-dadbod-ui",
      "kristijanhusak/vim-dadbod-completion",
    },
    -- opts = {
    --   db_competion = function()
    --     require("cmp").setup.buffer({
    --       sources = { { name = "vim-dadbod-completion" }, { name = "luasnip" }, { name = "buffer" } },
    --     })
    --   end,
    -- },
    config = function(_, opts)
      -- vim.g.db_ui_save_location = vim.fn.stdpath("config") .. require("plenary.path").path.sep .. "db_ui"
      vim.g.db_ui_save_location = "~/Alpha/sourceCode/sql/"
      vim.g.db_ui_auto_execute_table_helpers = 1

      -- local function bufferNameGenerator(opts)
      --   local time = os.date('%Y-%m-%d %H:%M:%S')
      --   return string.format('%s .sql', time)
      -- end

      -- _G.Db_ui_buffer_name_generator = bufferNameGenerator
      --
      -- vim.api.nvim_create_autocmd("FileType", {
      --   pattern = {
      --     "sql",
      --   },
      --   command = [[setlocal omnifunc=vim_dadbod_completion#omni]],
      -- })

      -- vim.api.nvim_create_autocmd("FileType", {
      --   pattern = {
      --     "sql",
      --     "mysql",
      --     "plsql",
      --   },
      --   callback = function()
      --     vim.schedule(opts.db_completion)
      --   end,
      -- })
    end,
    keys = {
      { "<leader>Dt", "<cmd>DBUIToggle<cr>",        desc = "Toggle UI" },
      { "<leader>Df", "<cmd>DBUIFindBuffer<cr>",    desc = "Find Buffer" },
      { "<leader>Dr", "<cmd>DBUIRenameBuffer<cr>",  desc = "Rename Buffer" },
      { "<leader>Dq", "<cmd>DBUILastQueryInfo<cr>", desc = "Last Query Info" },
    },
  },
}

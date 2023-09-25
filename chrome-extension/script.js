chrome.browserAction.onClicked.addListener(tab => { //Fired when User Clicks ICON
    chrome.tabs.executeScript(tab.id, {
            "file": "contentscript.js"
        }, result => { // last statement of contentscript
            console.log("Toggle night time...") // Notification on Completion
    })
})

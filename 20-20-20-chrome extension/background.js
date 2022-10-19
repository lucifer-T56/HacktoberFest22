
chrome.alarms.create('testAlarm', {
  periodInMinutes:20
});

chrome.alarms.onAlarm.addListener((alarm) => {
    if (alarm.name === "testAlarm") {
        chrome.notifications.create('alarm', {
            type: 'basic',
            iconUrl: 'eyes.png',
            title: 'Your Eyes need a Break ',
            message: '⬇️ Click Here',
            priority: 2,
            requireInteraction:true,
            buttons: [
                {title: 'Take a Break'}
               ]
        });
    }
});

chrome.notifications.onButtonClicked.addListener((alarm)=>{
  chrome.tabs.create({url:"popup.html"});
  chrome.notifications.clear('alarm');
})


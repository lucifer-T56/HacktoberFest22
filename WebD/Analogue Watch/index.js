setInterval(() => {
    d=new Date();
    htime=d.getHours();
    mtime=d.getMinutes();
    stime=d.getSeconds();

    hrot=30*htime+ mtime/2;
    mrot=6*mtime;
    srot=6*stime;

    hour.style.transform=`rotate(${hrot}deg)`;
    minute.style.transform=`rotate(${mrot}deg)`;
    second.style.transform=`rotate(${srot}deg)`;
}, 1000);
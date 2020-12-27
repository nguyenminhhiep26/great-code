var bgImgUrls = [
    "img/lightning-01.jpg",
    "img/lightning-02.jpg",
    "img/lightning-03.jpg"
];
var bgIdx = 0;
setInterval(setBackground, 3000);

function setBackground() {
    if (bgIdx < bgImgUrls.length-1)
        bgIdx ++;
    else
        bgIdx = 0;
    $("#container").css("background-image", 'url("' + bgImgUrls[bgIdx] + '")');
}

function changeItem(itemId){
    var orgWidth = $("#face-items")[0].offsetLeft;
    var curWidth = $(itemId)[0].offsetLeft;
    var headIdx = (orgWidth-curWidth)/366;
    var nextIdx = (headIdx < 9) ? headIdx+1:0;
    $(itemId).animate({"margin-left": "-"+(nextIdx*366).toString() + "px"});

}

function changeHead() {
    var orgWidth = $("#face-items")[0].offsetLeft;
    var curWidth = $("#headsstrip")[0].offsetLeft;
    var headIdx = (orgWidth-curWidth)/366;
    var nextIdx = (headIdx < 9) ? headIdx+1:0;
    $("#headsstrip").animate({"margin-left": "-"+(nextIdx*366).toString() + "px"});

}

function changeEye(){
    var orgWidth = $("#face-items")[0].offsetLeft;
    var curWidth = $("#eyesstrip")[0].offsetLeft;
    var headIdx = (orgWidth-curWidth)/366;
    var nextIdx = (headIdx < 9) ? headIdx+1:0;
    $("#eyesstrip").animate({"margin-left": "-"+(nextIdx*366).toString() + "px"});
}

function changeNose(){
    var orgWidth = $("#face-items")[0].offsetLeft;
    var curWidth = $("#nosesstrip")[0].offsetLeft;
    var headIdx = (orgWidth-curWidth)/366;
    var nextIdx = (headIdx < 9) ? headIdx+1:0;
    $("#nosesstrip").animate({"margin-left": "-"+(nextIdx*366).toString() + "px"});
}

function changeMouth(){
    var orgWidth = $("#face-items")[0].offsetLeft;
    var curWidth = $("#mouthsstrip")[0].offsetLeft;
    var headIdx = (orgWidth-curWidth)/366;
    var nextIdx = (headIdx < 9) ? headIdx+1:0;
    $("#mouthsstrip").animate({"margin-left": "-"+(nextIdx*366).toString() + "px"});
}
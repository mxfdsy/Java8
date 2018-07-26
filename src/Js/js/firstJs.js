function MyClick() {
    var iNum = 10;
    var sNum = "10";
    var iNum2 = 0;

    if (iNum === sNum) {
        iNum = sNum;
        iNum2 = iNum
    }
    alert(iNum2)
}
function MyClick1() {
    var iNum1 = 10;
    var sString = "sss";
    var bFlag = true;
    var aNum = [1, 3, 4, 5];
    var oObject = {name:"aaa",age:12}
    var fNumber = 10.23;
    var iNum2 = 10, sString = "adsf";
}

function MyClick2() {
    var i = 1;
    var iSum = 0;
    while (i < 101) {
        iSum += i
        i++;
    }
    alert(iSum)
}

function MyClick3() {
    var sInput = prompt("请输入1-7之间的一个整数");
    if (sInput == parseInt(sInput))
    {}
    else {
        alert("输入的不是一个整数");
    }
}
$(function () {
    $("#btn").click(function () {
        alert("hello world");
    });
});

$(function () {
    // $("input").click(function () {
    //     alert("aa");
    // })
    // 等选择器
    // $("p:odd").css("color", "red");
    // $("p:first").css("color", "red")
    // $("p:first-child").css("color", "red") 所属父标签的第一个孩子
});

$(function () {
    // $("div:has(a)").css("color", "red");
    // $("a[titile]").css("color", "red");
    // $("a[href^=www]").css("color" , "red");
    // $("a[href*=w]").css("color", "red"); 包含
    // $("input[type=button]").attr("disabled", "disabled");
    // $(":visible")
    // $("div").eq(2).css("color", "red");
    // $("div:gt(2)").css("color", "red");
    // $(".d1").parent().css("color", "red");
    $(".d1").children().css("color", "red");

});

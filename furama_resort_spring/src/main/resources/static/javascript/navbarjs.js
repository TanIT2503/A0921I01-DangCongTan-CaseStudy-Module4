// $(document).ready(function () {
//   $(".mr-auto .nav-item").bind("click", function (event) {
//     event.preventDefault();
//     var clickedItem = $(this);
//     $(".mr-auto .nav-item").each(function () {
//       $(this).removeClass("nav-active active");
//     });
//     clickedItem.addClass("nav-active active");
//   });
// });
document.addEventListener("DOMContentLoaded", function () {
  // add padding top to show content behind navbar
  navbar_height = document.querySelector(".navbar").offsetHeight;
  document.body.style.paddingTop = navbar_height + "px";
});

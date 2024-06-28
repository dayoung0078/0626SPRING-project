 $(document).ready(function () {
   $(".que").click(function () {
                                    $(this).next(".anw").stop().slideToggle(500);
                                    $(this).toggleClass('on').siblings().removeClass('on');
                                    $(this).next(".anw").siblings(".anw").slideUp(300); // Only one panel open at a time
    });
});




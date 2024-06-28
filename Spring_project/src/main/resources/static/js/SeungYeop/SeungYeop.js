 $(document).ready(function () {
   $(".que").click(function () {
                                    $(this).next(".anw").stop().slideToggle(500);
                                    $(this).toggleClass('on').siblings().removeClass('on');
                                    $(this).next(".anw").siblings(".anw").slideUp(300); // Only one panel open at a time
    });
});



 // document.addEventListener('DOMContentLoaded', function() {
 //
 //     let movieHtml = '';
 //
 //     movies.forEach(movie => {
 //
 //         movieHtml += `
 //
 //                <div class="movie_div">
 //
 //                    <div class="header">
 //
 //                        <div class="header_border">
 //
 //                            <div class="header_demon01">
 //
 //                                <p>${movie.title}</p>
 //
 //                            </div>
 //
 //                            <div class="header_demon02">
 //
 //                                <p>${movie.subtitle}</p>
 //
 //                            </div>
 //
 //                        </div>
 //
 //                    </div>
 //
 //                    <div class="body">
 //
 //                        <div class="body_img_box">
 //
 //                            <img class="body_img_demon" src="${movie.imageUrl}">
 //
 //                        </div>
 //
 //                    </div>
 //
 //                    <div class="footer">
 //
 //                        <div class="footer_summary">
 //
 //                            <div class="footer_summary02">
 //
 //                                <p>개요</p>
 //
 //                                <p>${movie.genre}</p>
 //
 //                                <p>${movie.country}</p>
 //
 //                                <p>${movie.duration}</p>
 //
 //                            </div>
 //
 //                            <div class="footer_summary03">
 //
 //                                <p>개봉</p>
 //
 //                                <p>${movie.releaseDate}</p>
 //
 //                            </div>
 //
 //                            <div class="footer_summary04">
 //
 //                                <p>평점</p>
 //
 //                                <p class="pentagram"></p>
 //
 //                                <p>${movie.rating}</p>
 //
 //                            </div>
 //
 //                            <div class="footer_summary05">
 //
 //                                <p>관객</p>
 //
 //                                <p>${movie.audience}</p>
 //
 //                            </div>
 //
 //                            <div class="footer_summary06">
 //
 //                                <p>원작</p>
 //
 //                                <a href="${movie.originalLink}" style="color: blue;">만화</a>
 //
 //                            </div>
 //
 //                            <p>${movie.description}</p>
 //
 //                        </div>
 //
 //                    </div>
 //
 //                </div>`;
 //
 //     });
 //
 //     document.querySelector('.movie').innerHTML = movieHtml;
 //
 // });
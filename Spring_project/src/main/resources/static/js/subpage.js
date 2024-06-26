document.addEventListener('DOMContentLoaded', function () {
    const posterData = {
        SeungYeop: [
            {
                imageUrl: "/img/seungYeop/demon.jpg",
                title: "우승엽 페이지",
                date: "2025.05.05",
                views: 272829,
                vlue:"SeungYeop"
            },
            // {
            //     imageUrl: "/img/seungYeop/Elemental.jpg",
            //     title: "우승엽 페이지 2",
            //     date: "2025.06.06",
            //     views: 303132,
            //     vlue:"Elemental"
            // },
            {imageUrl: "path_to_animation2.jpg", title: "우승엽 페이지 2", date: "2025.06.06", views: 303132,vlue:"SeungYeop"},
            {imageUrl: "path_to_animation3.jpg", title: "우승엽 페이지 3", date: "2025.07.07", views: 333435,vlue:"SeungYeop"},
            {imageUrl: "path_to_animation4.jpg", title: "우승엽 페이지 4", date: "2025.08.08", views: 363738,vlue:"SeungYeop"}
        ],
        DaYoung: [
            {
                imageUrl: "/img/362217a5a1e2a040687b12b2d212de0f.jpg",
                title: "다영님 페이지",
                date: "2025.09.09",
                views: 394041,
                vlue:"DaYoung"
            },
            {imageUrl: "/img/362217a5a1e2a040687b12b2d212de0f.jpg", title: "다영님 페이지 2",date: "2025.10.10", views: 424344,vlue:"DaYoung"},
            {imageUrl: "path_to_foreign3.jpg", title: "다영님 페이지 3", date: "2025.11.11", views: 454647,vlue:"DaYoung"},
            {imageUrl: "path_to_foreign4.jpg", title: "다영님 페이지 4", date: "2025.12.12", views: 484950,vlue:"DaYoung"}
        ],
        HyoJoo: [
            {imageUrl: "path_to_korean1.jpg", title: "효주님 페이지 1", date: "2026.01.01", views: 515253,vlue:"HyoJoo"},
            {imageUrl: "path_to_korean2.jpg", title: "효주님 페이지 2", date: "2026.02.02", views: 545556,vlue:"HyoJoo"},
            {imageUrl: "path_to_korean3.jpg", title: "효주님 페이지 3", date: "2026.03.03", views: 575859,vlue:"HyoJoo"},
            {imageUrl: "path_to_korean4.jpg", title: "효주님 페이지 4", date: "2026.04.04", views: 606162,vlue:"HyoJoo"}
        ],
        JaeHee: [
            {imageUrl: "path_to_science1.jpg", title: "재희님 페이지 1", date: "2026.05.05", views: 636465,vlue:"JaeHee"},
            {imageUrl: "path_to_science2.jpg", title: "재희님 페이지 2", date: "2026.06.06", views: 666768,vlue:"JaeHee"},
            {imageUrl: "path_to_science3.jpg", title: "재희님 페이지 3", date: "2026.07.07", views: 697071,vlue:"JaeHee"},
            {imageUrl: "path_to_science4.jpg", title: "재희님 페이지 4", date: "2026.08.08", views: 727374,vlue:"JaeHee"}
        ],
        HaYoung: [
            {imageUrl: "path_to_game1.jpg", title: "하영님 페이지 1", date: "2026.09.09", views: 757677, vlue:"HaYoung"},
            {imageUrl: "path_to_game2.jpg", title: "하영님 페이지 2", date: "2026.10.10", views: 787980,vlue:"HaYoung"},
            {imageUrl: "path_to_game3.jpg", title: "하영님 페이지 3", date: "2026.11.11", views: 818283,vlue:"HaYoung"},
            {imageUrl: "path_to_game4.jpg", title: "하영님 페이지 4", date: "2026.12.12", views: 848586,vlue:"HaYoung"}
        ],
        EunSeok: [
            {imageUrl: "path_to_iwon1.jpg", title: "은석 페이지", date: "2027.01.01", views: 878889,vlue:"EunSeok"},
            {imageUrl: "path_to_iwon2.jpg", title: "은석 페이지 2", date: "2027.02.02", views: 909192,vlue:"EunSeok"},
            {imageUrl: "path_to_iwon3.jpg", title: "은석 페이지 3", date: "2027.03.03", views: 939495,vlue:"EunSeok"},
            {imageUrl: "path_to_iwon4.jpg", title: "은석 페이지 4", date: "2027.04.04", views: 969798,vlue:"EunSeok"}
        ],
        MinJoo: [
            {imageUrl: "path_to_academy1.jpg", title: "민주님 페이지 1", date: "2027.05.05", views: 99100101,vlue:"MinJoo"},
            {imageUrl: "path_to_academy2.jpg", title: "민주님 페이지 2", date: "2027.06.06", views: 102103104,vlue:"MinJoo"},
            {imageUrl: "path_to_academy3.jpg", title: "민주님 페이지 3", date: "2027.07.07", views: 105106107,vlue:"MinJoo"},
            {imageUrl: "path_to_academy4.jpg", title: "민주님 페이지 4", date: "2027.08.08", views: 108109110,vlue:"MinJoo"}
        ]
    };

    const secondPosterData = {
        SeungYeop: [
            {imageUrl: "path_to_animation5.jpg", title: "우승엽 페이지 5", date: "2025.01.01", views: 151617,vlue:"SeungYeop"},
            {imageUrl: "path_to_animation6.jpg", title: "우승엽 페이지 6", date: "2025.02.02", views: 181920,vlue:"SeungYeop"},
            {imageUrl: "path_to_animation7.jpg", title: "우승엽 페이지 7", date: "2025.03.03", views: 212223,vlue:"SeungYeop"},
            {imageUrl: "path_to_animation8.jpg", title: "우승엽 페이지 8", date: "2025.04.04", views: 242526,vlue:"SeungYeop"}
        ],
        DaYoung: [
            {imageUrl: "path_to_foreign5.jpg", title: "다영님 페이지 5", date: "2025.01.01", views: 151617,vlue:"DaYoung"},
            {imageUrl: "path_to_foreign6.jpg", title: "다영님 페이지 6", date: "2025.02.02", views: 181920,vlue:"DaYoung"},
            {imageUrl: "path_to_foreign7.jpg", title: "다영님 페이지 7", date: "2025.02.02", views: 181920,vlue:"DaYoung"},
            {imageUrl: "path_to_foreign8.jpg", title: "다영님 페이지 8", date: "2025.04.04", views: 242526,vlue:"DaYoung"}
        ],
        HyoJoo: [
            {imageUrl: "path_to_korean5.jpg", title: "효주님 페이지 5", date: "2026.01.01", views: 151617,vlue:"HyoJoo"},
            {imageUrl: "path_to_korean6.jpg", title: "효주님 페이지 6", date: "2026.02.02", views: 181920,vlue:"HyoJoo"},
            {imageUrl: "path_to_korean7.jpg", title: "효주님 페이지 7", date: "2026.03.03", views: 212223,vlue:"HyoJoo"},
            {imageUrl: "path_to_korean8.jpg", title: "효주님 페이지 8", date: "2026.04.04", views: 242526,vlue:"HyoJoo"}
        ],
        JaeHee: [
            {imageUrl: "path_to_science5.jpg", title: "재희님 페이지 5", date: "2026.05.05", views: 151617,vlue:"JaeHee"},
            {imageUrl: "path_to_science6.jpg", title: "재희님 페이지 6", date: "2026.06.06", views: 181920,vlue:"JaeHee"},
            {imageUrl: "path_to_science7.jpg", title: "재희님 페이지 7", date: "2026.07.07", views: 212223,vlue:"JaeHee"},
            {imageUrl: "path_to_science8.jpg", title: "재희님 페이지 8", date: "2026.08.08", views: 242526,vlue:"JaeHee"}
        ],
        HaYoung: [
            {imageUrl: "path_to_game5.jpg", title: "하영님 페이지 5", date: "2026.09.09", views: 151617,vlue:"HaYoung"},
            {imageUrl: "path_to_game6.jpg", title: "하영님 페이지 6", date: "2026.10.10", views: 181920,vlue:"HaYoung"},
            {imageUrl: "path_to_game7.jpg", title: "하영님 페이지 7", date: "2026.11.11", views: 212223,vlue:"HaYoung"},
            {imageUrl: "path_to_game8.jpg", title: "하영님 페이지 8", date: "2026.12.12", views: 242526,vlue:"HaYoung"}
        ],
        EunSeok: [
            {imageUrl: "path_to_iwon5.jpg", title: "은석 페이지 5", date: "2027.01.01", views: 151617,vlue:"EunSeok"},
            {imageUrl: "path_to_iwon6.jpg", title: "은석 페이지 6", date: "2027.02.02", views: 181920,vlue:"EunSeok"},
            {imageUrl: "path_to_iwon7.jpg", title: "은석 페이지 7", date: "2027.03.03", views: 212223,vlue:"EunSeok"},
            {imageUrl: "path_to_iwon8.jpg", title: "은석 페이지 8", date: "2027.04.04", views: 242526,vlue:"EunSeok"}
        ],
        MinJoo: [
            {imageUrl: "path_to_academy5.jpg", title: "민주님 페이지 5", date: "2027.05.05", views: 151617,vlue:"MinJoo"},
            {imageUrl: "path_to_academy6.jpg", title: "민주님 페이지 6", date: "2027.06.06", views: 181920,vlue:"MinJoo"},
            {imageUrl: "path_to_academy7.jpg", title: "민주님 페이지 7", date: "2027.07.07", views: 212223,vlue:"MinJoo"},
            {imageUrl: "path_to_academy8.jpg", title: "민주님 페이지 8", date: "2027.08.08", views: 242526,vlue:"MinJoo"}
        ]
    };

    const firstContainer = document.getElementById('firstPosterContainer');
    const secondContainer = document.getElementById('secondPosterContainer');
    const bodyElement = document.querySelector('.bodyBack_Lee');

    function addPosterClickEvent(posterElement, data) {
        posterElement.addEventListener('click', function () {
            switch (data.vlue) {
                case 'EunSeok':
                    window.location.href = '/leePage';
                    break;
                case 'SeungYeop':
                    window.location.href = '/seungYeopPage';
                    break;
                case 'Elemental':
                    window.location.href = '/Elemental';
                    break;
                case 'DaYoung':
                    window.location.href = '/daYoungPage';
                    break;
                case 'HyoJoo':
                    window.location.href = '/hyoJooPage';
                    break;
                case 'JaeHee':
                    window.location.href = '/jaeHeePage';
                    break;
                case 'HaYoung':
                    window.location.href = '/haYoungPage';
                    break;
                case 'MinJoo':
                    window.location.href = '/minJooPage';
                    break;
                default:
                    console.log('Unknown vlue:', data.vlue);
            }
        });
    }

    // 각각의 백그라운드 이미지 저장 공간
    const backgroundImages = {
        SeungYeop: "url('/img/softBG.svg')",
        DaYoung: "url('/img/test-softBG.svg')",
        HyoJoo: "url('/img/test-softBG2.svg')",
        JaeHee: "url('path_to_science_background.jpg')",
        HaYoung: "url('path_to_game_background.jpg')",
        EunSeok: "url('path_to_iwon_background.jpg')",
        MinJoo: "url('path_to_academy_background.jpg')"
    };
    // 각각의 백그라운드 이미지 저장 공간
    // function createPosterBox(data) {
    //     const posterBox = document.createElement('div');
    //     posterBox.className = 'poster_Box';
    //     posterBox.innerHTML = `
    //     <div class="poster_Sub_Box">
    //         <div class="Back_img_poster" style="background-image: url('${data.imageUrl}');">
    //             <div>
    //                 <div class="Back_img_poster_Border"></div>
    //             </div>
    //         </div>
    //     </div>
    //     <p class="detail_Text">${data.title}</p>
    //     <div class="Data_day_Box">
    //         <div>
    //             <p class="font10">${data.date}</p>
    //         </div>
    //         <div class="Df Df_AC">
    //             <img src="/img/comment.svg" alt="" class="W16H16">
    //             <p class="font13">${data.views}</p>
    //         </div>
    //     </div>
    // `;
    //     addPosterClickEvent(posterBox, data); // 클릭 이벤트 추가
    //     return posterBox;
    // }

    function createPosterBox(data) {
        const posterBox = document.createElement('div');
        posterBox.className = 'body';
        posterBox.innerHTML = `
        <div class="body_img_box">
            <div class="body_img_demon" style="Back_img_poster_Border: url('${data.imageUrl}');">
                <div>
                    <div class="Back_img_poster_Border"></div>
                </div>
            </div>
        </div>
        <p class="detail_Text">${data.title}</p>
        <div class="Data_day_Box">
            <div>
                <p class="font10">${data.date}</p>
            </div>
            <div class="Df Df_AC">
                <img src="/img/comment.svg" alt="" class="W16H16">
                <p class="font13">${data.views}</p>
            </div>
        </div>
    `;
        addPosterClickEvent(posterBox, data); // 클릭 이벤트 추가
        return posterBox;
    }























































































    function updateFirstPosterContainer(data) {
        firstContainer.innerHTML = '';
        data.forEach(item => {
            firstContainer.appendChild(createPosterBox(item));
        });
    }

    function updateSecondPosterContainer(data) {
        secondContainer.innerHTML = '';
        data.forEach(item => {
            secondContainer.appendChild(createPosterBox(item));
        });
    }

    function updateBackgroundImage(category) {
        bodyElement.style.backgroundImage = backgroundImages[category];
    }

    document.querySelectorAll('nav a').forEach(link => {
        link.addEventListener('click', function (event) {
            event.preventDefault();
            const category = this.getAttribute('data-category');
            updateFirstPosterContainer(posterData[category]);
            updateSecondPosterContainer(secondPosterData[category]);
            updateBackgroundImage(category);
        });
    });

    // 디폴트로 애니메이션 데이터를 로드
    updateFirstPosterContainer(posterData.SeungYeop);
    updateSecondPosterContainer(secondPosterData.SeungYeop);
    updateBackgroundImage('SeungYeop');


});

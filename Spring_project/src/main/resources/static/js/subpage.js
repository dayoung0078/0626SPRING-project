document.addEventListener('DOMContentLoaded', function () {
    const posterData = {
        SeungYeop: [
            {
                imageUrl: "/img/seungYeop/demon.jpg",
                title: "귀멸의 칼날",
                date: "2025.05.05",
                views: 272829,
                value: "우승엽 페이지"
            },
            {
                imageUrl: "path_to_animation2.jpg",
                title: "엘리멘탈",
                date: "2025.06.06",
                views: 303132,
                value: "우승엽 페이지 1"
            },
            {
                imageUrl: "path_to_animation3.jpg",
                title: "우승엽 페이지 3",
                date: "2025.07.07",
                views: 333435,
                value: "우승엽 페이지 2"
            },
            {
                imageUrl: "path_to_animation4.jpg",
                title: "우승엽 페이지 4",
                date: "2025.08.08",
                views: 363738,
                value: "우승엽 페이지 3"
            }
        ],
        DaYoung: [
            {
                imageUrl: "/img/362217a5a1e2a040687b12b2d212de0f.jpg",
                title: "다영님 페이지",
                date: "2025.09.09",
                views: 394041,
                value: "다영님 페이지"
            },
            {
                imageUrl: "/img/362217a5a1e2a040687b12b2d212de0f.jpg",
                title: "다영님 페이지 2",
                date: "2025.10.10",
                views: 424344,
                value: "다영님 페이지 1"
            },
            {
                imageUrl: "path_to_foreign3.jpg",
                title: "다영님 페이지 3",
                date: "2025.11.11",
                views: 454647,
                value: "다영님 페이지 2"
            },
            {
                imageUrl: "path_to_foreign4.jpg",
                title: "다영님 페이지 4",
                date: "2025.12.12",
                views: 484950,
                value: "다영님 페이지 3"
            }
        ],

        JaeHee: [
            {
                imageUrl: "path_to_science1.jpg",
                title: "재희님 페이지 1",
                date: "2026.05.05",
                views: 636465,
                value: "재희님 페이지 1"
            },
            {
                imageUrl: "path_to_science2.jpg",
                title: "재희님 페이지 2",
                date: "2026.06.06",
                views: 666768,
                value: "재희님 페이지 2"
            },
            {
                imageUrl: "path_to_science3.jpg",
                title: "재희님 페이지 3",
                date: "2026.07.07",
                views: 697071,
                value: "재희님 페이지 3"
            },
            {
                imageUrl: "path_to_science4.jpg",
                title: "재희님 페이지 4",
                date: "2026.08.08",
                views: 727374,
                value: "재희님 페이지 4"
            }
        ],
        HaYoung: [
            {
                imageUrl: "path_to_game1.jpg",
                title: "하영님 페이지 1",
                date: "2026.09.09",
                views: 757677,
                value: "하영님 페이지 1"
            },
            {
                imageUrl: "path_to_game2.jpg",
                title: "하영님 페이지 2",
                date: "2026.10.10",
                views: 787980,
                value: "하영님 페이지 2"
            },
            {
                imageUrl: "path_to_game3.jpg",
                title: "하영님 페이지 3",
                date: "2026.11.11",
                views: 818283,
                value: "하영님 페이지 3"
            },
            {
                imageUrl: "path_to_game4.jpg",
                title: "하영님 페이지 4",
                date: "2026.12.12",
                views: 848586,
                value: "하영님 페이지 4"
            }
        ],
        EunSeok: [
            {
                imageUrl: "path_to_iwon1.jpg",
                title: "은석 페이지",
                date: "2027.01.01",
                views: 878889,
                value: "은석 페이지 1"
            },
            {
                imageUrl: "path_to_iwon2.jpg",
                title: "은석 페이지 2",
                date: "2027.02.02",
                views: 909192,
                value: "은석 페이지 2"
            },
            {
                imageUrl: "path_to_iwon3.jpg",
                title: "은석 페이지 3",
                date: "2027.03.03",
                views: 939495,
                value: "은석 페이지 3"
            },
            {
                imageUrl: "path_to_iwon4.jpg",
                title: "은석 페이지 4",
                date: "2027.04.04",
                views: 969798,
                value: "은석 페이지 4"
            }
        ],

    };

    const secondPosterData = {
        SeungYeop: [
            {
                imageUrl: "path_to_animation5.jpg",
                title: "우승엽 페이지 5",
                date: "2025.01.01",
                views: 151617,
                value: "우승엽 페이지 4"
            },
            {
                imageUrl: "path_to_animation6.jpg",
                title: "우승엽 페이지 6",
                date: "2025.02.02",
                views: 181920,
                value: "우승엽 페이지 5"
            },
            {
                imageUrl: "path_to_animation7.jpg",
                title: "우승엽 페이지 7",
                date: "2025.03.03",
                views: 212223,
                value: "우승엽 페이지 6"
            },
            {
                imageUrl: "path_to_animation8.jpg",
                title: "우승엽 페이지 8",
                date: "2025.04.04",
                views: 242526,
                value: "우승엽 페이지 7"
            }
        ],
        DaYoung: [
            {
                imageUrl: "path_to_foreign5.jpg",
                title: "다영님 페이지 5",
                date: "2025.01.01",
                views: 151617,
                value: "다영님 페이지 4"
            },
            {
                imageUrl: "path_to_foreign6.jpg",
                title: "다영님 페이지 6",
                date: "2025.02.02",
                views: 181920,
                value: "다영님 페이지 5"
            },
            {
                imageUrl: "path_to_foreign7.jpg",
                title: "다영님 페이지 7",
                date: "2025.02.02",
                views: 181920,
                value: "다영님 페이지 6"
            },
            {
                imageUrl: "path_to_foreign8.jpg",
                title: "다영님 페이지 8",
                date: "2025.04.04",
                views: 242526,
                value: "다영님 페이지 7"
            }
        ],

        JaeHee: [
            {
                imageUrl: "path_to_science5.jpg",
                title: "재희님 페이지 5",
                date: "2026.05.05",
                views: 151617,
                value: "재희님 페이지 5"
            },
            {
                imageUrl: "path_to_science6.jpg",
                title: "재희님 페이지 6",
                date: "2026.06.06",
                views: 181920,
                value: "재희님 페이지 6"
            },
            {
                imageUrl: "path_to_science7.jpg",
                title: "재희님 페이지 7",
                date: "2026.07.07",
                views: 212223,
                value: "재희님 페이지 7"
            },
            {
                imageUrl: "path_to_science8.jpg",
                title: "재희님 페이지 8",
                date: "2026.08.08",
                views: 242526,
                value: "재희님 페이지 8"
            }
        ],
        HaYoung: [
            {
                imageUrl: "path_to_game5.jpg",
                title: "하영님 페이지 5",
                date: "2026.09.09",
                views: 151617,
                value: "하영님 페이지 5"
            },
            {
                imageUrl: "path_to_game6.jpg",
                title: "하영님 페이지 6",
                date: "2026.10.10",
                views: 181920,
                value: "하영님 페이지 6"
            },
            {
                imageUrl: "path_to_game7.jpg",
                title: "하영님 페이지 7",
                date: "2026.11.11",
                views: 212223,
                value: "하영님 페이지 7"
            },
            {
                imageUrl: "path_to_game8.jpg",
                title: "하영님 페이지 8",
                date: "2026.12.12",
                views: 242526,
                value: "하영님 페이지 8"
            }
        ],
        EunSeok: [
            {
                imageUrl: "path_to_iwon5.jpg",
                title: "은석 페이지 5",
                date: "2027.01.01",
                views: 151617,
                value: "은석 페이지 5"
            },
            {
                imageUrl: "path_to_iwon6.jpg",
                title: "은석 페이지 6",
                date: "2027.02.02",
                views: 181920,
                value: "은석 페이지 6"
            },
            {
                imageUrl: "path_to_iwon7.jpg",
                title: "은석 페이지 7",
                date: "2027.03.03",
                views: 212223,
                value: "은석 페이지 7"
            },
            {
                imageUrl: "path_to_iwon8.jpg",
                title: "은석 페이지 8",
                date: "2027.04.04",
                views: 242526,
                value: "은석 페이지 8"
            }
        ],

    };

    const firstContainer = document.getElementById('firstPosterContainer');
    const secondContainer = document.getElementById('secondPosterContainer');
    const bodyElement = document.querySelector('.bodyBack_Lee');


    function addPosterClickEvent(posterElement, data) {
        posterElement.addEventListener('click', function () {
            window.location.href = `/navigate?value=${encodeURIComponent(data.value)}`;
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
    function createPosterBox(data) {
        const posterBox = document.createElement('div');
        posterBox.className = 'poster_Box';
        posterBox.innerHTML = `
        <div class="poster_Sub_Box">
            <div class="Back_img_poster" style="background-image: url('${data.imageUrl}');">
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




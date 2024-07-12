document.addEventListener('DOMContentLoaded', function () {
    const firstContainer = document.getElementById('firstPosterContainer');
    const secondContainer = document.getElementById('secondPosterContainer');
    const bodyElement = document.querySelector('.bodyBack_Lee');

    const backgroundImages = {
        SeungYeop: "url('/img/softBG.svg')",
        DaYoung: "url('/img/test-softBG.svg')",
        HyoJoo: "url('/img/test-softBG2.svg')",
        JaeHee: "url('path_to_science_background.jpg')",
        HaYoung: "url('path_to_game_background.jpg')",
        EunSeok: "url('path_to_iwon_background.jpg')",
        MinJoo: "url('path_to_academy_background.jpg')"
    };

    function addPosterClickEvent(posterElement, id) {
        posterElement.addEventListener('click', function () {
            window.location.href = `/poster/${id}`;
        });
    }

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
        addPosterClickEvent(posterBox, data.id); // 클릭 이벤트 추가
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

    function fetchPosters(category, type, updateContainer) {
        fetch(`/api/posters?category=${category}&type=${type}`)
            .then(response => response.json())
            .then(data => {
                updateContainer(data);
                updateBackgroundImage(category);
            })
            .catch(error => console.error('Error fetching posters:', error));
    }

    document.querySelectorAll('nav a').forEach(link => {
        link.addEventListener('click', function (event) {
            event.preventDefault();
            const category = this.getAttribute('data-category');
            fetchPosters(category, 'first', updateFirstPosterContainer);
            fetchPosters(category, 'second', updateSecondPosterContainer);
        });
    });

    // 디폴트로 SeungYeop 데이터를 로드
    fetchPosters('SeungYeop', 'first', updateFirstPosterContainer);
    fetchPosters('SeungYeop', 'second', updateSecondPosterContainer);
});
document.addEventListener('DOMContentLoaded', function () {

    let jhHtml = '';

    jhs.forEach(jh => {

        jhHtml += `

                <p class="susub">${movie.title}</p>

                    <div class="header">

                        <div class="container">
			
			<img class="test2" src="${jh.imageUrl}">

                            <div class="text">

			<div class="text">
				
				<h1>${jh.sub_title}</h1>
                               		
				<p>${jh.release_date}</p>

				<p>${jh.running_time}</p>

				<p>${jh.age}</p>

				<p>${jh.people}</p>

			</div>

			<div class="test">

                   			 <a class="square" href="${jh.youtube_link}">예고편 재생</a>

			</div>

			<p>${jh.description}</p>

		</div>

	</div>

	<div class="container2">

		<div class="styled-div">

			<h1 class="box1">순위 누적 관객수</h1>

			<p class="box 1-1">${jh.people}</p>

		</div>

		<div class="styled-div">

			<h1 class="box2">실관람객 평점</h1>

                		<div style="display: flex;align-items: center;justify-content: center; width: 100%;">

			<div class="star">★</div>

                    		<div>

                        			<p>${jh.audience_like}</p>

                    		</div>
         
			<div class="styled-div">

				<h1 class="box3">네티즌 평점</h1>

                			<div style="display: flex;align-items: center;justify-content: center; width: 100%;">

					<div class="star">★ </div>
				
					<div>
					
					 	<p>{jh.netizen_like}</p>
						
					</div>

				</div>

			</div>
		
		</div>

                </div>`;

    });

    document.querySelector('.jh').innerHTML = jhHtml;

});
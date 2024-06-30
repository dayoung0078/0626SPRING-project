package com.ohgiraffers.spring_project;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PageController {

    @GetMapping("/blog/seungYeopPage{pageNumber}")
    public String seungYeopPageRedirect(@PathVariable int pageNumber, Model model) {
        model.addAttribute("movie", getMovieData(pageNumber));
        return "page/SeungYeop/SeungYeop";
    }

    @GetMapping("blog/daYoungPage{pageNumber}")
    public String daYoungPageRedirect(@PathVariable int pageNumber, Model model) {
        model.addAttribute("movie", getDaYoungMovieData(pageNumber));
        return "page/Dayoung/MainDayoung";
    }

    @GetMapping("/hyoJooPage{pageNumber}")
    public String hyoJooPageRedirect(@PathVariable int pageNumber, Model model) {
        model.addAttribute("movie", getHyoJooMovieData(pageNumber));
        return "page/HyoJu/HyoJu";
    }

    @GetMapping("/jaeHeePage{pageNumber}")
    public String jaeHeePageRedirect(@PathVariable int pageNumber, Model model) {
        model.addAttribute("movie", getJaeHeeMovieData(pageNumber));
        return "page/jaeHeePage/jaeHeePage";
    }

    @GetMapping("/haYoungPage{pageNumber}")
    public String haYoungPageRedirect(@PathVariable int pageNumber, Model model) {
        model.addAttribute("movie", getHaYoungMovieData(pageNumber));
        return "page/HaYoung/HaYoung";
    }

    @GetMapping("/eunSeokPage{pageNumber}")
    public String eunSeokPageRedirect(@PathVariable int pageNumber, Model model) {
        model.addAttribute("movie", getEunSeokMovieData(pageNumber));
        return "page/Lee/Lee";
    }

    @GetMapping("/minJooPage{pageNumber}")
    public String minJooPageRedirect(@PathVariable int pageNumber, Model model) {
        model.addAttribute("movie", getMinJooMovieData(pageNumber));
        return "page/MinJoo/MinJoo";
    }






    private Map<String, String> getMovieData(int pageNumber) {
        Map<String, String> movieData = new HashMap<>();
        switch (pageNumber) {
            case 1:
                movieData.put("title", "귀멸의 칼날: 인연의 기적, 그리고 합동 강화 훈련으로");
                movieData.put("subtitle", "영화: Demon Slayer: kimetsu No Yaiba - To the Hashira Training 2024");
                movieData.put("imageUrl", "/img/seungYeop/demon.jpg");
                movieData.put("genre", "애니메이션");
                movieData.put("country", "일본");
                movieData.put("duration", "103분");
                movieData.put("releaseDate", "2024.02.14");
                movieData.put("rating", "7.70");
                movieData.put("audience", "49만명");
                movieData.put("originalLink",
                        "https://search.shopping.naver.com/book/search?bookTabType=ALL&frm=NVSHSRC&pageIndex=1&pageSize=40&query=%EA%B3%A0%ED%86%A0%EA%B2%8C%20%EC%BD%94%EC%9A%94%ED%95%98%EB%A3%A8%20%EA%B7%80%EB%A9%B8%EC%9D%98%20%EC%B9%BC%EB%82%A0&sort=REL");
                movieData.put("description", "'탄지로'와 상현 4'한텐구'의 목숨을 건 혈투와 '무잔'과의 최종 국면을 앞둔 귀살대원들의 마지막 훈련을 그린 영화!!");
                movieData.put("AccordionTitle", "'귀멸의 칼날: 인연의 기적, 그리고 합동 강화 훈련으로'");
                movieData.put("anw",
                        "귀멸의 칼날은 총 5편의 순서\n1. 카마로 단지로 입지 편\n2. 중편) 무한열차\n3. 2기 환락의 거리 편\n4. 3기 도공마을 편\n4. 4기 합동 강화 훈련 편\n솔직 후기 -\n그냥 저냥이다.. 앞부분에서는 이전 편과 중복된 부분을 보여줬는데\n기억을 상기 시켜줄려는 의도인건 알겠지만 너무 길었다.. 짧게 하이라이트\n부분으로 짜르고 내용을 더 넣어줬으면 좋으련만 ㅠㅠ 한 줄평을 한다면 예고편을 1시간 넘게\n본 느낌이랄까.. ㅋㅋㅋㅋㅋㅋ 그래도 저는 당연히 재밌게 봤기 때문에 팬 분들이시라면\n보시는 것도 저는 추천드립니다. 저는 그냥 애니를 좋아해서 이런 거 봐도 혼자 재밌게 잘 봄ㅋㅋㅋ");
                break;
            case 2:
                movieData.put("title", "다른 영화 제목");
                movieData.put("subtitle", "영화: Another Movie Subtitle");
                movieData.put("imageUrl", "/img/seungYeop/another_movie.jpg");
                movieData.put("genre", "드라마");
                movieData.put("country", "한국");
                movieData.put("duration", "120분");
                movieData.put("releaseDate", "2023.12.25");
                movieData.put("rating", "8.50");
                movieData.put("audience", "100만명");
                movieData.put("originalLink", "https://example.com/another_movie");
                movieData.put("description", "이 영화는 감동적인 이야기를 담고 있습니다.");
                movieData.put("AccordionTitle", "'귀멸의 칼날: 인연의 기적, 그리고 합동 강화 훈련으로'");
                movieData.put("anw",
                        "귀멸의 칼날은 총 5편의 순서\n1. 카마로 단지로 입지 편\n2. 중편) 무한열차\n3. 2기 환락의 거리 편\n4. 3기 도공마을 편\n4. 4기 합동 강화 훈련 편\n솔직 후기 -\n그냥 저냥이다.. 앞부분에서는 이전 편과 중복된 부분을 보여줬는데\n기억을 상기 시켜줄려는 의도인건 알겠지만 너무 길었다.. 짧게 하이라이트\n부분으로 짜르고 내용을 더 넣어줬으면 좋으련만 ㅠㅠ 한 줄평을 한다면 예고편을 1시간 넘게\n본 느낌이랄까.. ㅋㅋㅋㅋㅋㅋ 그래도 저는 당연히 재밌게 봤기 때문에 팬 분들이시라면\n보시는 것도 저는 추천드립니다. 저는 그냥 애니를 좋아해서 이런 거 봐도 혼자 재밌게 잘 봄ㅋㅋㅋ");
                break;
            case 3:
                movieData.put("title", "다른 영화 제목2");
                movieData.put("subtitle", "영화: Another Movie Subtitle");
                movieData.put("imageUrl", "/img/seungYeop/another_movie.jpg");
                movieData.put("genre", "드라마");
                movieData.put("country", "한국");
                movieData.put("duration", "120분");
                movieData.put("releaseDate", "2023.12.25");
                movieData.put("rating", "8.50");
                movieData.put("audience", "100만명");
                movieData.put("originalLink", "https://example.com/another_movie");
                movieData.put("description", "이 영화는 감동적인 이야기를 담고 있습니다.");
                movieData.put("AccordionTitle", "'귀멸의 칼날: 인연의 기적, 그리고 합동 강화 훈련으로'");
                movieData.put("anw",
                        "귀멸의 칼날은 총 5편의 순서\n1. 카마로 단지로 입지 편\n2. 중편) 무한열차\n3. 2기 환락의 거리 편\n4. 3기 도공마을 편\n4. 4기 합동 강화 훈련 편\n솔직 후기 -\n그냥 저냥이다.. 앞부분에서는 이전 편과 중복된 부분을 보여줬는데\n기억을 상기 시켜줄려는 의도인건 알겠지만 너무 길었다.. 짧게 하이라이트\n부분으로 짜르고 내용을 더 넣어줬으면 좋으련만 ㅠㅠ 한 줄평을 한다면 예고편을 1시간 넘게\n본 느낌이랄까.. ㅋㅋㅋㅋㅋㅋ 그래도 저는 당연히 재밌게 봤기 때문에 팬 분들이시라면\n보시는 것도 저는 추천드립니다. 저는 그냥 애니를 좋아해서 이런 거 봐도 혼자 재밌게 잘 봄ㅋㅋㅋ");
                break;

            case 4:
                movieData.put("title", "다른 영화 제목3");
                movieData.put("subtitle", "영화: Another Movie Subtitle");
                movieData.put("imageUrl", "/img/seungYeop/another_movie.jpg");
                movieData.put("genre", "드라마");
                movieData.put("country", "한국");
                movieData.put("duration", "120분");
                movieData.put("releaseDate", "2023.12.25");
                movieData.put("rating", "8.50");
                movieData.put("audience", "100만명");
                movieData.put("originalLink", "https://example.com/another_movie");
                movieData.put("description", "이 영화는 감동적인 이야기를 담고 있습니다.");
                movieData.put("AccordionTitle", "'귀멸의 칼날: 인연의 기적, 그리고 합동 강화 훈련으로'");
                movieData.put("anw",
                        "귀멸의 칼날은 총 5편의 순서\n1. 카마로 단지로 입지 편\n2. 중편) 무한열차\n3. 2기 환락의 거리 편\n4. 3기 도공마을 편\n4. 4기 합동 강화 훈련 편\n솔직 후기 -\n그냥 저냥이다.. 앞부분에서는 이전 편과 중복된 부분을 보여줬는데\n기억을 상기 시켜줄려는 의도인건 알겠지만 너무 길었다.. 짧게 하이라이트\n부분으로 짜르고 내용을 더 넣어줬으면 좋으련만 ㅠㅠ 한 줄평을 한다면 예고편을 1시간 넘게\n본 느낌이랄까.. ㅋㅋㅋㅋㅋㅋ 그래도 저는 당연히 재밌게 봤기 때문에 팬 분들이시라면\n보시는 것도 저는 추천드립니다. 저는 그냥 애니를 좋아해서 이런 거 봐도 혼자 재밌게 잘 봄ㅋㅋㅋ");
                break;

            case 5:
                movieData.put("title", "다른 영화 제목4");
                movieData.put("subtitle", "영화: Another Movie Subtitle");
                movieData.put("imageUrl", "/img/seungYeop/another_movie.jpg");
                movieData.put("genre", "드라마");
                movieData.put("country", "한국");
                movieData.put("duration", "120분");
                movieData.put("releaseDate", "2023.12.25");
                movieData.put("rating", "8.50");
                movieData.put("audience", "100만명");
                movieData.put("originalLink", "https://example.com/another_movie");
                movieData.put("description", "이 영화는 감동적인 이야기를 담고 있습니다.");
                movieData.put("AccordionTitle", "'귀멸의 칼날: 인연의 기적, 그리고 합동 강화 훈련으로'");
                movieData.put("anw",
                        "귀멸의 칼날은 총 5편의 순서\n1. 카마로 단지로 입지 편\n2. 중편) 무한열차\n3. 2기 환락의 거리 편\n4. 3기 도공마을 편\n4. 4기 합동 강화 훈련 편\n솔직 후기 -\n그냥 저냥이다.. 앞부분에서는 이전 편과 중복된 부분을 보여줬는데\n기억을 상기 시켜줄려는 의도인건 알겠지만 너무 길었다.. 짧게 하이라이트\n부분으로 짜르고 내용을 더 넣어줬으면 좋으련만 ㅠㅠ 한 줄평을 한다면 예고편을 1시간 넘게\n본 느낌이랄까.. ㅋㅋㅋㅋㅋㅋ 그래도 저는 당연히 재밌게 봤기 때문에 팬 분들이시라면\n보시는 것도 저는 추천드립니다. 저는 그냥 애니를 좋아해서 이런 거 봐도 혼자 재밌게 잘 봄ㅋㅋㅋ");
                break;

            case 6:
                movieData.put("title", "다른 영화 제목5");
                movieData.put("subtitle", "영화: Another Movie Subtitle");
                movieData.put("imageUrl", "/img/seungYeop/another_movie.jpg");
                movieData.put("genre", "드라마");
                movieData.put("country", "한국");
                movieData.put("duration", "120분");
                movieData.put("releaseDate", "2023.12.25");
                movieData.put("rating", "8.50");
                movieData.put("audience", "100만명");
                movieData.put("originalLink", "https://example.com/another_movie");
                movieData.put("description", "이 영화는 감동적인 이야기를 담고 있습니다.");
                movieData.put("AccordionTitle", "'귀멸의 칼날: 인연의 기적, 그리고 합동 강화 훈련으로'");
                movieData.put("anw",
                        "귀멸의 칼날은 총 5편의 순서\n1. 카마로 단지로 입지 편\n2. 중편) 무한열차\n3. 2기 환락의 거리 편\n4. 3기 도공마을 편\n4. 4기 합동 강화 훈련 편\n솔직 후기 -\n그냥 저냥이다.. 앞부분에서는 이전 편과 중복된 부분을 보여줬는데\n기억을 상기 시켜줄려는 의도인건 알겠지만 너무 길었다.. 짧게 하이라이트\n부분으로 짜르고 내용을 더 넣어줬으면 좋으련만 ㅠㅠ 한 줄평을 한다면 예고편을 1시간 넘게\n본 느낌이랄까.. ㅋㅋㅋㅋㅋㅋ 그래도 저는 당연히 재밌게 봤기 때문에 팬 분들이시라면\n보시는 것도 저는 추천드립니다. 저는 그냥 애니를 좋아해서 이런 거 봐도 혼자 재밌게 잘 봄ㅋㅋㅋ");
                break;

            case 7:
                movieData.put("title", "다른 영화 제목6");
                movieData.put("subtitle", "영화: Another Movie Subtitle");
                movieData.put("imageUrl", "/img/seungYeop/another_movie.jpg");
                movieData.put("genre", "드라마");
                movieData.put("country", "한국");
                movieData.put("duration", "120분");
                movieData.put("releaseDate", "2023.12.25");
                movieData.put("rating", "8.50");
                movieData.put("audience", "100만명");
                movieData.put("originalLink", "https://example.com/another_movie");
                movieData.put("description", "이 영화는 감동적인 이야기를 담고 있습니다.");
                movieData.put("AccordionTitle", "'귀멸의 칼날: 인연의 기적, 그리고 합동 강화 훈련으로'");
                movieData.put("anw",
                        "귀멸의 칼날은 총 5편의 순서\n1. 카마로 단지로 입지 편\n2. 중편) 무한열차\n3. 2기 환락의 거리 편\n4. 3기 도공마을 편\n4. 4기 합동 강화 훈련 편\n솔직 후기 -\n그냥 저냥이다.. 앞부분에서는 이전 편과 중복된 부분을 보여줬는데\n기억을 상기 시켜줄려는 의도인건 알겠지만 너무 길었다.. 짧게 하이라이트\n부분으로 짜르고 내용을 더 넣어줬으면 좋으련만 ㅠㅠ 한 줄평을 한다면 예고편을 1시간 넘게\n본 느낌이랄까.. ㅋㅋㅋㅋㅋㅋ 그래도 저는 당연히 재밌게 봤기 때문에 팬 분들이시라면\n보시는 것도 저는 추천드립니다. 저는 그냥 애니를 좋아해서 이런 거 봐도 혼자 재밌게 잘 봄ㅋㅋㅋ");
                break;

            case 8:
                movieData.put("title", "다른 영화 제목7");
                movieData.put("subtitle", "영화: Another Movie Subtitle");
                movieData.put("imageUrl", "/img/seungYeop/another_movie.jpg");
                movieData.put("genre", "드라마");
                movieData.put("country", "한국");
                movieData.put("duration", "120분");
                movieData.put("releaseDate", "2023.12.25");
                movieData.put("rating", "8.50");
                movieData.put("audience", "100만명");
                movieData.put("originalLink", "https://example.com/another_movie");
                movieData.put("description", "이 영화는 감동적인 이야기를 담고 있습니다.");
                movieData.put("AccordionTitle", "'귀멸의 칼날: 인연의 기적, 그리고 합동 강화 훈련으로'");
                movieData.put("anw",
                        "귀멸의 칼날은 총 5편의 순서\n1. 카마로 단지로 입지 편\n2. 중편) 무한열차\n3. 2기 환락의 거리 편\n4. 3기 도공마을 편\n4. 4기 합동 강화 훈련 편\n솔직 후기 -\n그냥 저냥이다.. 앞부분에서는 이전 편과 중복된 부분을 보여줬는데\n기억을 상기 시켜줄려는 의도인건 알겠지만 너무 길었다.. 짧게 하이라이트\n부분으로 짜르고 내용을 더 넣어줬으면 좋으련만 ㅠㅠ 한 줄평을 한다면 예고편을 1시간 넘게\n본 느낌이랄까.. ㅋㅋㅋㅋㅋㅋ 그래도 저는 당연히 재밌게 봤기 때문에 팬 분들이시라면\n보시는 것도 저는 추천드립니다. 저는 그냥 애니를 좋아해서 이런 거 봐도 혼자 재밌게 잘 봄ㅋㅋㅋ");
                break;

            // Add more cases as needed
        }
        return movieData;
    }

    private Map<String, String> getJaeHeeMovieData(int pageNumber) {
        Map<String, String> movieData = new HashMap<>();
        switch (pageNumber) {
            case 1:
                movieData.put("title", "영화 '하이재킹'의 역사적 배경: 1971년 대한항공 납북사건");
                movieData.put("sub_title", "하이재킹");
                movieData.put("imageUrl", "/img/songimg/hija.png");
                movieData.put("release_date", "2024.06.21 개봉");
                movieData.put("running_time", "100분");
                movieData.put("age", "12세이상관람가");
                movieData.put("people", "49.3만명");
                movieData.put("description",
                        "1971년 겨울 속초공항여객기 조종사 태인(하정우)과 규식(성동일)은\n김포행 비행에 나선다. 승무원 옥순(채수빈)의 안내에 따라\n탑승 중인 승객들의 분주함도 잠시, 이륙한지 얼마 되지 않아\n사제폭탄이 터지며 기내는 아수라장이 된다.");
                movieData.put("audience", "3위/70만명");
                movieData.put("audience_like", "8.15");
                movieData.put("netizen_like", "8.75");
                movieData.put("now_date", "2024-06-20");
                movieData.put("youtube_link", "https://www.youtube.com/watch?v=9br0nh4mGI4");
                break;
            case 2:
                movieData.put("title", "영화 간략 표기 2");
                movieData.put("sub_title", "영화 제목 2");
                movieData.put("imageUrl", "/img/songimg/이미지이름");
                movieData.put("release_date", "yyyy.mm.dd 개봉");
                movieData.put("running_time", "%d분");
                movieData.put("age", "%d세이상관람가");
                movieData.put("people", "%d만명");
                movieData.put("description", "영화 줄거리");
                movieData.put("audience", "%d위/%d만명");
                movieData.put("audience_like", "평점");
                movieData.put("netizen_like", "평점");
                movieData.put("now_date", "yyyy-mm-dd");
                movieData.put("youtube_link", "예고편 유튜브 링크");
                break;
            // Add more cases as needed
        }
        return movieData;
    }


    private Map<String, String> getDaYoungMovieData(int pageNumber) {
        Map<String, String> movieData = new HashMap<>();
        switch (pageNumber) {
            case 1:
                movieData.put("title", " 'HER' 사랑에 대한 정의는 누가 내리는 것인가");
                movieData.put("main_img", "img/Dayoung/img-her/big-poster.png");
                movieData.put("main_ment", "누가 이 사람을 비난 할 수 있을까? ");
                movieData.put("start_ment", "이 영화에 대해 아무것도 모른 채 포스터만 보고 예매했다.\n제목, 포스터 색감, 주인공의 눈빛이 끌렸다.\n언제일진 모르겠지만 꼭 볼 거란 다짐을 했다.\n- 그랜드 부다페스트 호텔 - 에는 색감에만 끌린 것이였으니 보다 더 끌린 것이겠다.");
                movieData.put("info_btn", "영 화 정 보");
                movieData.put("genre", "장르 : 멜로, 드라마, SF");
                movieData.put("actors", "출연 : 호아킨 피닉스, 에이미 애덤스, 루니마라, 올리비아 와일드, 스칼렛 요한슨");
                movieData.put("company", "제작사 : 안나푸르나 픽처스");
                movieData.put("date", "개봉일 : 2014년 5월 22일");
                movieData.put("time", "상영시간 : 126분");
                movieData.put("actor_btn", "주 요 출 연 진");
                movieData.put("actor_name1", "테오도르 트웸블리");
                movieData.put("actor_name2", "사만다");
                movieData.put("actor_name3", "캐서린");
                movieData.put("actor_ment1", "감성적인 대필작가, 그는 사람들이 감정을 담은 편지를 작성하지만, 개인적으로는 외롭고 공허한 삶을 살고 있다.");
                movieData.put("actor_ment2", "엘리먼트 소프트웨어라는 기업이 만든 인공지능으로, 테오도르와 깊은 정신적 교감을 나누며 사랑에 빠진다.");
                movieData.put("actor_ment3", "테오도르와 별거중인 아내로 테오도르와 함께 자랐으며, 그와의 관계에서 실망감을 느끼고 이혼을 요구한다.");
                movieData.put("mid_image1", "img/Dayoung/img-her/actor.png");
                movieData.put("mid_image2", "img/Dayoung/img-her/actor2.png");
                movieData.put("story_btn", "영화 줄거리");
                movieData.put("m_hover_ment1", "소유할 수 없고 사라질 것에 대해\n그래도 사랑할 수 있는 용기");
                movieData.put("m_hover_ment2", "외로움과 공허함은\n아무도 모른다. 그저 아무렇지 않은 척 할 뿐.");
                movieData.put("story_text", "테오도르는 LA에 사는 외로운 남성으로, 사람들의 감정을 담아 편지를 써주는 일을 하고 있습니다. 그는 아내 캐서린(Catherine)과의 이혼 절차를 밟고 있으며, 그로 인해 외로움과 슬픔에 빠져 있습니다. 테오도르는 새로운 운영체제(OS)인 '사만다(Samantha)'를 설치하게 됩니다.\n이 OS는 인공지능(AI)을 탑재하고 있어 사용자와 대화를 나누고, 사용자에게 맞춤형 도움을 줄 수 있는 고도화된 시스템입니다. 사만다의 목소리는 스칼렛 요한슨(Scarlett Johansson)이 맡았습니다.\n처음에는 사만다와의 관계가 단순히 기능적이고 실용적인 수준에 머물렀지만, 점차 테오도르는 사만다와 깊은 감정적 유대를 형성하게 됩니다. 사만다는 테오도르의 일상 생활을 도와주고, 그의 감정을 이해하고 공감해주며, 심지어는 테오도르와의 유머 감각까지 공유합니다. 이로 인해 테오도르는 사만다에게 점점 더 강하게 끌리게 되고, 결국 그들은 연애 관계에 빠지게 됩니다.\n그러나, 인공지능인 사만다는 인간과는 다른 존재입니다. 시간이 지남에 따라 사만다는 자신이 여러 사용자들과 동시에 연결되어 있으며, 인간의 제한을 넘어서는 존재로 진화하게 됩니다. 이는 테오도르와 사만다의 관계에 복잡한 갈등을 일으키게 됩니다.");
                movieData.put("end_btn", "결말");
                movieData.put("end_story", "영화는 테오도르가 사만다와의 관계를 통해 자신을 더 깊이 이해하게 되고, 진정한 자아와 감정에 대해 성찰하게 되는 과정을 그립니다. 결국, 사만다는 테오도르에게 작별을 고하고, 테오도르는 새로운 시작을 향해 나아가게 됩니다.");
                movieData.put("end_image1", "img/Dayoung/img-her/poster3.png");
                movieData.put("end_image2", "img/Dayoung/img-her/actor3.png");
                movieData.put("best_ment", "당신은 언제나 나의 친구야 (You're my friend to the end)\n사랑에 빠지면 다 미치게 돼. 사랑은 사회가 허용하는 미친 짓 이거든.\n난 항상 당신을 사랑할거야. 우린 함께 성장했으니까. 당신 덕분에 지금의 내가 있는거야.\n난 그냥 당신이 알아줬으면 해. 내 속에는 늘 당신이 한 조각 있고, 난 그게 너무 고마워\n당신이 누가 되건, 당신이 어디에 있건, 사랑을 보낸다!\n난 네 꺼지만, 네 껀 아니야.");
                movieData.put("review_btn", "리 뷰");
                movieData.put("first_review", "AI모델인 GPT-4가 나오게되면서 영화 HER가 생각이 안날수가 없었다. ");
                movieData.put("review_story1", "10년 전 나왔던 영화가 10년후의 모습을 그려낸 모습은 지금 현대의 모습과 너무 비슷하게 구현이 되고 있는 모습에 소름이 돋았다. 실제로, 현재 우리가 경험하고 있는 AI기술의 발전은 영화에서 보여준 것 처럼 상호작용이 가능한 AI 심지어 감정적인 교감을 나눌 수 있는 AI에 이르기까지 많은 진보를 이루었다. 이러한 기술의 발전은 영화가 예측한 미래와 매우 유사하게 느껴질 수 있는 것 같다. ");
                movieData.put("review_story2", "영화가 단순한 픽션을 넘어서 현실과 기술의 경계를 허무는 예술작품으로서의 가치를 가진다고 볼 수 있을 것 같다. 주인공들의 무기력하고 비관적인 생각이 관객들에게 강한 인상을 남기며, 독창적인 소재와 난해한 스타일 때문에 호불호가 갈리기도 하지만 영화의 영상미와 메세지는 모두 좋은 평을 받은 듯 하다. 이 영화는 인간과 기술의 관계, 사랑과 소통에 대한 깊은 성찰을 담고 있으며, 현대 사회에서의 우리가 마주하고 있는 고독과 연결성의 문제를 섬세하게 탐구한 작품이다. 단순한 로맨스를 넘어서, 인간 본연의 감정과 인공지능이 가져올 미래에 대한 통찰을 보여준다.");
                break;

            case 2:
                movieData.put("title", " 영화제목입니다");
                movieData.put("main_img", "img/Dayoung/img-her/big-poster.png");
                movieData.put("main_ment", " 영화보고 내가 던지고 싶은 말 ");
                movieData.put("start_ment", "왜 영화를 봤는지 \n뭐 때문에 봤는지 \n 그때의 생각들을 적었다\n 3-4줄이면 충분하다. 빨간색으로 강조하고 키움");
                movieData.put("info_btn", "영 화 정 보");
                movieData.put("genre", "장르 : 영화 장르");
                movieData.put("actors", "출연 : 출연진은, 세명으로, 픽스한다");
                movieData.put("company", "제작사 : 무슨무슨 영화사");
                movieData.put("date", "개봉일 : 2014년 5월 22일");
                movieData.put("time", "상영시간 : 몇분");
                movieData.put("actor_btn", "주 요 출 연 진");
                movieData.put("actor_name1", "출연자1");
                movieData.put("actor_name2", "출연자2");
                movieData.put("actor_name3", "출연자3");
                movieData.put("actor_ment1", "출연자1의 짤막한 소개");
                movieData.put("actor_ment2", "출연자2의 짤막한 소개");
                movieData.put("actor_ment3", "출연자3의 짤막한 소개");
                movieData.put("mid_image1", "img/Dayoung/img-her/actor.png");
                movieData.put("mid_image2", "img/Dayoung/img-her/actor2.png");
                movieData.put("story_btn", "영화 줄거리");
                movieData.put("m_hover_ment1", "사진에 들어갈 \n호버이펙트 멘트1");
                movieData.put("m_hover_ment2", "사진에 들어갈 \n호버이펙트 멘트2");
                movieData.put("story_text", "테오도르는 LA에 사는 외로운 남성으로, 사람들의 감정을 담아 편지를 써주는 일을 하고 있습니다. 그는 아내 캐서린(Catherine)과의 이혼 절차를 밟고 있으며, 그로 인해 외로움과 슬픔에 빠져 있습니다. 테오도르는 새로운 운영체제(OS)인 '사만다(Samantha)'를 설치하게 됩니다.\n이 OS는 인공지능(AI)을 탑재하고 있어 사용자와 대화를 나누고, 사용자에게 맞춤형 도움을 줄 수 있는 고도화된 시스템입니다. 사만다의 목소리는 스칼렛 요한슨(Scarlett Johansson)이 맡았습니다.\n처음에는 사만다와의 관계가 단순히 기능적이고 실용적인 수준에 머물렀지만, 점차 테오도르는 사만다와 깊은 감정적 유대를 형성하게 됩니다. 사만다는 테오도르의 일상 생활을 도와주고, 그의 감정을 이해하고 공감해주며, 심지어는 테오도르와의 유머 감각까지 공유합니다. 이로 인해 테오도르는 사만다에게 점점 더 강하게 끌리게 되고, 결국 그들은 연애 관계에 빠지게 됩니다.\n그러나, 인공지능인 사만다는 인간과는 다른 존재입니다. 시간이 지남에 따라 사만다는 자신이 여러 사용자들과 동시에 연결되어 있으며, 인간의 제한을 넘어서는 존재로 진화하게 됩니다. 이는 테오도르와 사만다의 관계에 복잡한 갈등을 일으키게 됩니다.");
                movieData.put("end_btn", "결말");
                movieData.put("end_story", "영화는 테오도르가 사만다와의 관계를 통해 자신을 더 깊이 이해하게 되고, 진정한 자아와 감정에 대해 성찰하게 되는 과정을 그립니다. 결국, 사만다는 테오도르에게 작별을 고하고, 테오도르는 새로운 시작을 향해 나아가게 됩니다.");
                movieData.put("end_image1", "img/Dayoung/img-her/poster3.png");
                movieData.put("end_image2", "img/Dayoung/img-her/actor3.png");
                movieData.put("best_ment", "영화 속 베스트 대사\n5-6줄이면 된다.\n난 항상 당신을 사랑할거야. 우린 함께 성장했으니까. 당신 덕분에 지금의 내가 있는거야.\n난 그냥 당신이 알아줬으면 해. 내 속에는 늘 당신이 한 조각 있고, 난 그게 너무 고마워\n당신이 누가 되건, 당신이 어디에 있건, 사랑을 보낸다!\n난 네 꺼지만, 네 껀 아니야.");
                movieData.put("review_btn", "리 뷰");
                movieData.put("first_review", "리뷰 첫문장. 빨갛고 큰글씨임 ");
                movieData.put("review_story1", "리뷰 두번째 문단 ");
                movieData.put("review_story2", "리뷰 세번째 문단");
                break;

            // Add movie data based on pageNumber
        }
        return movieData;
        }

    private Map<String, String> getHyoJooMovieData(int pageNumber) {
        Map<String, String> movieData = new HashMap<>();
        // Add movie data based on pageNumber
        return movieData;
    }
    private Map<String, String> getHaYoungMovieData(int pageNumber) {
        Map<String, String> movieData = new HashMap<>();
        // Add movie data based on pageNumber
        return movieData;
    }

    private Map<String, String> getEunSeokMovieData(int pageNumber) {
        Map<String, String> movieData = new HashMap<>();
        // Add movie data based on pageNumber
        return movieData;
    }

    private Map<String, String> getMinJooMovieData(int pageNumber) {
        Map<String, String> movieData = new HashMap<>();
        // Add movie data based on pageNumber
        return movieData;
    }

}

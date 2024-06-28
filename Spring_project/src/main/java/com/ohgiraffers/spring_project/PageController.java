package com.ohgiraffers.spring_project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PageController {
    // @GetMapping("/seungYeopPage")
    // public String seungYeopPageRedirect() {
    // return "page/SeungYeop/SeungYeop";
    // }
    //
    // @GetMapping("/seungYeopPage2")
    // public String seungYeopPage2Redirect() {
    // return "page/SeungYeop/SeungYeop2";
    // }
    //
    // @GetMapping("/seungYeopPage3")
    // public String seungYeopPage3Redirect() {
    // return "page/SeungYeop/SeungYeop3";
    // }
    //
    // @GetMapping("/daYoungPage")
    // public String daYoungPageRedirect() {
    // return "page/Dayoung/MainDayoung";
    // }
    //
    // @GetMapping("/hyoJooPage")
    // public String hyoJooPageRedirect() {
    // return "page/HyoJu/HyoJu";
    // }
    //
    // @GetMapping("/jaeHeePage")
    // public String jaeHeePageRedirect() {
    // return "page/jaeHeePage/jaeHeePage";
    // }
    //
    // @GetMapping("/haYoungPage")
    // public String haYoungPageRedirect() {
    // return "page/HaYoung/HaYoung";
    // }
    //
    // @GetMapping("/eunSeokPage")
    // public String eunSeokPageRedirect() {
    // return "page/EunSeok/EunSeok";
    // }
    //
    // @GetMapping("/minJooPage")
    // public String minJooPageRedirect() {
    // return "page/MinJoo/MinJoo";
    // }

    @GetMapping("/seungYeopPage{pageNumber}")
    public String seungYeopPageRedirect(@PathVariable int pageNumber, Model model) {
        model.addAttribute("movie", getMovieData(pageNumber));
        return "page/SeungYeop/SeungYeop";
    }

    @GetMapping("/daYoungPage{pageNumber}")
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
        // Add movie data based on pageNumber
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

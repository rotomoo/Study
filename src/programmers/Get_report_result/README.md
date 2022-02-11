[프로그래머스] 신고 결과 받기
======================
# 1. 문제명 및 난이도
## ▶ 문제명
	신고 결과 받기

## ▶ 난이도
	Level 1

****
## 2. 출처
### [프로그래머스](https://programmers.co.kr/learn/courses/30/lessons/92334)
<img src="https://programmers.co.kr/assets/icons/apple-icon-6eafc2c4c58a21aef692d6e44ce99d41f999c71789f277317532d0a9c6db8976.png" width="100px" height="100px" title="px(픽셀) 크기 설정" alt="main1"></img><br/>
****
## 3. 알고리즘 [풀이]
### Hojihoon
    진행중

### Sonbyeongil
    HashMap에 HashSet을 사용해 중복을 제거한 reportMap을 선언해준다.
    중요한것은 reportMap은 그 유저가 신고한 유저가 아닌 그 유저를 신고한 유저를 추가해 주어야 한다.
    reportMap의 key값을 기준으로 size가 k이상이면 그 유저들은 key유저를 신고한 유저로 메일을 받는다.
    여기서 메일의 개수를 담는 result 는 LinkedHashMap으로 기존 Hashmap과 달리 순서가 보장된다.
    순서가 보장되었기 때문에 람다식을 사용해 리턴해도 된다.
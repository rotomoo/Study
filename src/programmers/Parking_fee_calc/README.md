[프로그래머스] 주차 요금 계산
======================
# 1. 문제명 및 난이도
## ▶ 문제명
	주차 요금 계산

## ▶ 난이도
	Level 2

****
## 2. 출처
### [프로그래머스](https://programmers.co.kr/learn/courses/30/lessons/92341)
<img src="https://programmers.co.kr/assets/icons/apple-icon-6eafc2c4c58a21aef692d6e44ce99d41f999c71789f277317532d0a9c6db8976.png" width="100px" height="100px" title="px(픽셀) 크기 설정" alt="main1"></img><br/>
****
## 3. 알고리즘 [풀이]
### Hojihoon
    진행중

### Sonbyeongil
    map을 2개 선언해준다.
    정렬된 답이 필요하기 때문에 1개는 Key값으로 정렬되는 Treemap을 선언해준다.
    records 배열을 기준으로 In 이 들어올때 Hashmap에, out이 들어올때 Treemap에 분으로 계산한 시간을 넣어준다.
    여기서 out이 들어올때 기존 map에 있는 데이터를 삭제 해준다.
    마지막으로 맵에 남아있는 데이터를 23시 59분 기준으로 계산한다.
    최종적으로 트리맵에 Key는 차번호 Value 는 사용한 시간이 남게된다.
    초과된 시간이 0분보다 높다면 카운트 해줘야 하기 때문에 Math.ceil을 사용해준다. 
[프로그래머스] k진수에서 소수 개수 구하기
======================
# 1. 문제명 및 난이도
## ▶ 문제명
	k진수에서 소수 개수 구하기

## ▶ 난이도
	Level 2

****
## 2. 출처
### [프로그래머스](https://programmers.co.kr/learn/courses/30/lessons/92335)
<img src="https://programmers.co.kr/assets/icons/apple-icon-6eafc2c4c58a21aef692d6e44ce99d41f999c71789f277317532d0a9c6db8976.png" width="100px" height="100px" title="px(픽셀) 크기 설정" alt="main1"></img><br/>
****
## 3. 알고리즘 [풀이]
### Hojihoon
    진행중

### Sonbyeongil
    n을 k진수화 한후
    0으로 split하여 소수를 찾아준다.
    여기서 '1001' 처럼 '00'일시 split한 결과가 ""가 나올수 있으니 예외 처리 해준다.
    테스트케이스 1, 11 에서 런타임 오류가 발생했는데 long타입으로 보내주면 된다.
    또 테스트 케이스 1에서 시간초과가 나온다면 효율적으로 해결해야 하는데,
    소수찾는 함수의 for문을 Math.sqrt를 사용해 제곱근까지 돌게하면 모든 약수를 체크할수 있다.
    why?
    제곱근보다 같거나 작은 숫자로 나누어지면 그 이후에 대해서는 대칭이므로 계산을 할 필요가 없다
    ex ) 16일경우 1,2,4,8,16 이 있는데 15까지 안돌고 4까지만 돌아도 된다.(4는 포함)
# 코틀린 기본 문법

- Range
    - [시작점 ~ 끝지점] 범위 안에서 1step씩 전진하는 개념
    - IntRange, CharRange

- Progression
    - [시작점 ~ 끝지점] 범위 안에서 “K step” 씩 전진하는 개념
    - Range 와 기본적인 개념은 동일하고 조작법도 동일

# Tries와 Binary Search

- Tries
    - Collection 형태로 저장될 수 있는 데이터를 저장하는 특수한 Tree
    - 특히, Prefix matching 에 효과적으로 활용될 수 있음

- Binary Search
    - BS 알고리즘
       - Step 1: 가운데 아이템의 index 찾기
       - Step 2: 가운데 아이템이 찾던 아이템이면 종료,
            - 그렇지 않으면 Step 3 으로 진행
       - Step 3: 찾던 아이템이 가운데 아이템보다 크면,
            - 이제부턴 오른쪽 절반만 고려하여 Step 1 부터 반복
            - (찾던 아이템이 작으면, 왼쪽 절반만 고려하여 Step 1 부터 반복)
           - 만약 더 이상 고려할만한 아이템이 없으면 종료

- Summary
    - Prefix Matching 종류의 문제를 풀고자 할 겨우, Trie는 최적의 자료구조일 것이다.
    - 아이템들이 정렬되어 있다는 가정하에, Binary Search를 통해 임의의 아이템을 찾는 것은 시간복잡도 O(Log n)이다
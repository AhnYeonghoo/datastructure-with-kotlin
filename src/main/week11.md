# Kotlin Basic

- Collection 객체에 대하여, 임의의 조건을 만족하는 아이템들만 추려내서 List를 만들 때는 filter를 사용.
- 각 아이템들에 대한 임의의 변환작업을 수행하여, 완전히 새로운 List를 만들 떄는 map을 사용
- 각 아이템들에 대한 일종의 요약값을 만들어내고 싶을 떄는 reduced를 사용

<br>

# Merge Sort

- Divide and Conquer 방식의 Sort 알고리즘
    - 커다랗고 어려운 문제를 쉽고 조그맣게 쪼개서 해결하고 모아서 최종 결과물 만듦.
    - Compare 횟수를 기준으로, 시간복잡도는 O(n log n)
    - 공간복잡도도 동일

<br>

# Radix Sort: LSD(Least Significant Digit)

- 지금까지 살펴봤던 정렬 알고리즘은 Comparison을 통해 동작
- Radix Sort 알고리즘은 Comparison을 사용하지 않음.
- Radix Sort 알고리즘의 시간복잡도는 O(kn) -> k: 가장 큰 아이템의 자릿수, n: 아이템의 개수
- 공간복잡도는 O(n)
    - 아이템들을 담을 버켓들을 위한 메모리 공간이 필요

<br>

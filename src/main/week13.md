# Kotlin Basic

- StringBulider 
    - 문자열에 대한 자유도 높은 기능을 제공한다.
        - with, apply와 함께 사용
    
- Label
    - 이름@ 형태로써 Kotlin의 명령문, 명령블록에 붙일 수 있음.
        - eg: 라벨을 통해 중첩 반복문에서 한방 탈출이 가능
        - Java의 Annotation 문법과 다름!

<br>

# Heap Sort

- Comparison 기반의 정렬 알고리즘
    - Heap Sort는 Heap 자료구조를 활용하여 정렬 수행
    - MaxHeap & MinHeap Property와 Partially Sort되어 있다는 특징을 활용
    

<br>

# Quick Sort

- Comparison 기반의 Sorting 알고리즘으로, merge sort와 마찬가지로 Divide & Conquer 방식의 알고리즘
    - Merge Sort와는 달리, 'pivot'이라는 아이템을 정해 pivot을 기준으로 Divide
        - Pivot을 어떻게 정할지에 대한 기준은 여러가지가 존재, 이에 따라서 퀵소트 알고리즘의 동작이 달라지게 됨
    - Pivot을 결정하는 방식에 따라서 퀵소트 동작의 효율이 크게 바뀜
        - 만약 이미 정렬되어 있는 배열에 대하여 {Lomuto, Hoare} 알고리즘 사용시, Insertion Sort 알고리즘과 유사하게 동작하게 됨
            - 시간복잡도 O(n^2)!

<br>

# Stable & In-place

- Stable 정렬 알고리즘
    - 주어진 아이템들에 중복된 아이템들이 존재시, Sort 알고리즘의 결과에서도 아이템들의 순서가 유지

- In-place 정렬 알고리즘
    - 알고리즘 수행을 위해 별도의 메모리 공간을 사용하지 않고, 아이템이 저장되어 있던 공간을 직접 사용하는것.
    - 동일한 Sort 알고리즘이더라도 어떻게 구현했느냐에 따라서 In-place 여부가 바뀔 수 있음.
    - 앞서 살펴본 Bubble, Insertion, selection, Heap, Quick은 In-place 방식으로 동작

<br>

Quiz

- 1. Quick Sort의 평균적은 시간복잡도는 O(n^2)이다.
    - X -> 최악의 Case에서만 이럼.
- 2. 오름차순으로 정렬할 때 MaxHeap을 사용할 수 있다.
    - O -> ooooo

# Heap(Binary Heap)
- Complete Binary Tree로서, Heap Property를 만족함
  - Complete Binary Tree란 마지막 level을 제외한 나머지 level은 노드들로 꽉 채워져 있음.
  - 주의!! 메모리에 존재하는 Heap과는 전혀 다른 개념임

<br>

### 2가지 종류의 Heap의 Heap Property(heap invariant)
- MaxHeap: 값이 클 수록 priority가 높음
    - Parent 노드는 Children 노드의 값보다 항상 크거나 같은 값을 가짐
    - Root 노드는 가장 큰 값을 가지게 됨
- MinHeap: 값이 작을 수록 priority가 높음
    - Parent 노드는 Children 노드의 값보다 항상 작거나 같은 값을 가짐
    - Root 노드는 가장 작은 값을 가지게 됨.
- 노드가 가진 아이템 간의 대소비교가 가능해야 Heap을 사용 가능

<br>

### Why Heap?
- Collection 내의 최대/최소 아이템을 찾기!
- 아이템 정렬하기
- PRiority Queue라는 자료구조를 구현할 때 사용 가능

<br>

### How Heap?
- Heap은 아이템 간의 대소비교를 하고, 필요시 아이템간의 자리바꿈을 자주 수행하게 됨
- Complete Binary Tree라는 특징을 감안하면, Array를 사용하여 구현함으로써 효율적으로 동작하도록 할 수 있음.
    - Space & Time Complexity 모두에서 효율적
- 노드 X의 index를 x라고 부르도록 하자
    - Left Child의 index: 2x + 1
    - Right Child의 index: 2x + 2
    - 임의의 노드 X의 부모 노드의 index는 (x-1)/2로 얻을 수 있음.
        - 위와 같은 방식을 통해, 일반 Binary Tree의 Traverse에 대한 시간복잡도는 O(log n)
        - Heap의 Traverse는 O(1)이 된다.
<br>
    
# Priority Queue
- Queue는 FIFO에 의한 자료구조이다.
- Priority Queue는 priority에 의해 dequeue 순서가 결정되며 2가지가 존재
    - Max-Priority: Queue의 맨 앞 아이템은 항상 최댓값을 가진다.
    - Min-Priority: Queue의 맨 앞 아이템은 항상 최솟값을 가진다.
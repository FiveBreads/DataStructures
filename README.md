DataStructures  
==============  

7강 큐(Queue)  
-------------
큐의 이해  
큐의 구조는 매우 심플하다. 선입선출(FIFO)  

큐의 ADT 정의 
void QueueInit(Queue * pq);  
큐의 초기화한다.  
생성자 역할을 한다.  
  
int QisEmpty(Queue * pq);  
큐가 빈 경우 TRUE(1)를 그렇지 않은 경우 FALSE(0)을 리턴한다.  
  
void Enqueue(Queue * pq, Data data);  
큐에 매개변수로 받은 data를 저장한다.  
  
Data Dequeue(Queue * pq);  
큐에 원소가 있을 경우 제일 앞의 원소를 제거한다.  

Data QPeek(Queue * pq);  
가장 앞선 순서의 데이터를 반환하되 삭제하지는 않는다.  
데이터가 하나 이상이 있다는 것을 보장받는다.  
  
큐의 구현에 대한 논리  
가장 앞선 순서의 데이터를 가리키는 front  
가장 늦은 순서의 데이터를 가리키는 rear  
이 두종류의 커서와 ArrayList나 LinkedList로 큐는 구현될 수 있다.  
  
ArrayList로 구현  
배열을 이용한 큐의 구현은 꼬리쪽인 rear을 뒤로 미는 형식으로 데이터를 삽입하고  
머리 쪽인 front를 움직여 데이터를 삭제한다.  
이런 방법을 사용하게 되면 데이터를 삭제하는 과정에서 front의 인덱스가 rear에 가까워지기 때문에  
낮은 인덱스의 공간이 비게되는 단점이 생긴다.  
이를 보완하기 위해 원형 큐의 방식으로 구현을 한다.  

원형 큐(Circular Queue)의 구현  
배열의 크기를 MOD연산하여 낮은 인덱스에 데이터를 넣는것은 성공했으나 또하나의 문제가 있다.
그것은 큐가 꽉 찬 경우와 텅 빈 경우의 front가 rear보다 한 칸 앞선 위치를 가리킨다는 것이다.  
"front와 rear의 위치만으로는 꽉 찬 경우와 텅 빈 경우를 구분할 수 없다."  
이를 위한 해결방법으로
"배열의 길이가 N일때 데이터가 N-1개 채워지면 이를 꽉 찬 것으로 간주하자!"라는  
대를 위해 소를 희생하는 방법을 사용한다.  

front는 항상 0번째의 인덱스를 가리키고 있으며 이 위치는 비워져 있다. 

'''c
int NextPodIdx( int pos )
{
  if(pos == (n-1)) {
    return 0;
  }else {
    return pos + 1;
  }
}
'''
위의 함수가 큐의 회전을 도와  
매개변수 pos가 N-1개의 데이터를 가지게 된다면 front의 값, 0을 가지게 하여  
큐가 꽉 찼음을 알 수 있게 해준다.  

LinkedList로 구현  
연결리스트는 구현이 배열보다 상대적으로 쉬운데 그 이유는 메모리 할당을 malloc을 통해 동적으로
할당하여 인덱스의 끝이 정해져 있지 않기 때문이다.  

front와 rear는 NULL로 초기화 된 상태로 최초 데이터의 등장을 기다린다.  
최초 데이터가 Enqueue함수를 통해 큐에 들어오면 두 개의 커서는 그 데이터에 한하여 
같은 위치를 가르키게 된다.  

두번째 Enqueue의 호출부터는 rear만 이동하고, Dequeue메서드 호출 시 front가 이동하며 지우게 된다.  
큐에 단 하나의 데이터만 남았을 경우에는 front의 값은 null이 되지만 rear의 값은 지워지지 않아  
쓰레기 값이 남게 되는데, 다음에 들어올 첫 데이터로 초기화가 될 것이기 때문에 문제가 되지 않는다.  


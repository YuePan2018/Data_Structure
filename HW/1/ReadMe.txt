Task: inheritance and iterator

Task Descprition:
1.classes
BoundedQueue, an interface which declares all the methods that must be implemented by any class that implements BoundedQueue.
AbstractBoundedQueue, an abstract class which implements BoundedQueue, capturing the redundancies between methods in BoundedQueue.
ArrayRingBuffer, a class which extends AbstractBoundedQueue and uses an array as the actual implementation of the BoundedQueue.
2.The bounded queue has a fixed size and is a FIFO
throw a run-time exception if the client attempts to enqueue() into a full buffer or call dequeue() or peek() on an empty buffer
3.Make the BoundedQueue Iterable.
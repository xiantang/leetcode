/*
 * @lc app=leetcode id=295 lang=java
 *
 * [295] Find Median from Data Stream
 *
 * https://leetcode.com/problems/find-median-from-data-stream/description/
 *
 * algorithms
 * Hard (35.63%)
 * Total Accepted:    99.4K
 * Total Submissions: 279K
 * Testcase Example:  '["MedianFinder","addNum","addNum","findMedian","addNum","findMedian"]\n[[],[1],[2],[],[3],[]]'
 *
 * Median is the middle value in an ordered integer list. If the size of the
 * list is even, there is no middle value. So the median is the mean of the two
 * middle value.
 * For example,
 * 
 * [2,3,4], the median is 3
 * 
 * [2,3], the median is (2 + 3) / 2 = 2.5
 * 
 * Design a data structure that supports the following two operations:
 * 
 * 
 * void addNum(int num) - Add a integer number from the data stream to the data
 * structure.
 * double findMedian() - Return the median of all elements so far.
 * 
 * 
 * 
 * 
 * Example:
 * 
 * 
 * addNum(1)
 * addNum(2)
 * findMedian() -> 1.5
 * addNum(3) 
 * findMedian() -> 2
 * 
 * 
 * 
 * 
 * Follow up:
 * 
 * 
 * If all integer numbers from the stream are between 0 and 100, how would you
 * optimize it?
 * If 99% of all integer numbers from the stream are between 0 and 100, how
 * would you optimize it?
 * 
 * 
 */
class MedianFinder {

    /** initialize your data structure here. */
    private PriorityQueue<Integer> l;
    private PriorityQueue<Integer> r;
    /** initialize your data structure here. */
    public MedianFinder() {
        r = new PriorityQueue<Integer>();
        l = new PriorityQueue<Integer>(new Comparator<Integer>(){ //大顶堆，容量11
            @Override
            public int compare(Integer i1,Integer i2){
                return i2-i1;
            }
        });
    }

    public void addNum(int num) {
        if(l.size() == 0 || num<=l.peek()){
            l.add(num);
        }
        else {
            r.add(num);
        }
        if(l.size()<r.size()){
            l.add(r.poll());
//            r.remove();
        }else if(l.size() - r.size() ==2){
            r.add(l.poll());
//            l.remove();
        }

    }

    public double findMedian() {
        if(l.size()>r.size()){
            return l.peek();
        }
        else{
            double res = ((double)l.peek()+(double)r.peek())/2;
            return res;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */


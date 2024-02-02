//package pilotRun;
//
//
//Design a system that manages the reservation state of n seats that are numbered from 1 to n.
//
//Implement the SeatManager class:
//
//SeatManager(int n) Initializes a SeatManager object that will manage n seats numbered from 1 to n.
// All seats are initially available.
//int reserve() Fetches the smallest-numbered unreserved seat, reserves it, and returns its number.
//void unreserve(int seatNumber) Unreserves the seat with the given seatNumber.
//
//
//Example 1:
//
//Input
//["SeatManager", "reserve", "reserve", "unreserve", "reserve", "reserve", "reserve", "reserve", "unreserve"]
//        [[5], [1], [], [2], [], [], [], [], [5]]
//
//Output
//[null, 1, 2, null, 2, 3, 4, 5, null]
//
//
//
//public class SeatManager {
//
//   private int maxcapacity = 0;
//   private int [] seats ;
//
//    public SeatManager(int n) {
//        maxcapacity = n;  // object initlise with capacity;
//        seats = new int [maxcapacity];
//    }
//
//5 ->  1 2 3 4 5
//    0 0
//
//    public int reserve() {
//        for(int i =0; i <= seats.length ; i ++) {
//           if(seats[i] != 0) {
//               i = 0;
//           }
//        }
//    }
//
//    public void unreserve(int seatNumber) {
//
//        for()
//            if(0 -> occupied )
//        {
//
//            i = seatNumber;
//
//
//        }
//
//        seats[]
//
//    }
//
//
//}

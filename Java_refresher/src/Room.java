
public class Room {
	private final int LAB[] = {1000,1001,1002};
	private final int NON_LAB[]= {5000,5001,5002};
	private final String BUILDING_PREFIX="ENGR";
	public static final int MIN_ROOM_NUMBER=1000;
	public static final int MAX_ROOM_NUMBER=5999;
	public static final int MIN_SEAT_CAPACITY=0;
	public static final int MAX_SEAT_CAPACITY=100;
	private int seatCapacity=0;
	private boolean isLab;
	private boolean isAvailable;
	private  int numRooms;
	
	Room(){}
	Room(boolean isLab){ this.isLab=isLab;}
	
	public int getLAB() {
		return LAB[(int)(Math.random()*LAB.length)];
	}
	public int getNoneLab() {
		return NON_LAB[(int)(Math.random()*NON_LAB.length)];
	}
	public boolean numOfSeats(int seats) {
		if(seats > MIN_SEAT_CAPACITY && seats < MAX_SEAT_CAPACITY) {
			return true;
		}else {
		return false;
		}
	}
	public boolean existingRoom(int roomNum) {
		boolean result=false;
		for(int x=0; x<this.LAB.length;x++) {
			if(roomNum==LAB[x]) {
				result= true;
			}else {
				result=false;
			}
		}
		return result;
	}
	
	
		
	
}

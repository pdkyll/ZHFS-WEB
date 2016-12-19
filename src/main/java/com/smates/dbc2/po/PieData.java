package com.smates.dbc2.po;

/**
 * 用于饼图数据返回的实体类
 * 
 * @author March
 *
 */
public class PieData {

	private int roomId;
	private String roomNum;
	private String roomName;
	private int count;

	public PieData() {
	}

	public PieData(int roomId, String roomNum, String roomName, int count) {
		this.roomId = roomId;
		this.roomNum = roomNum;
		this.roomName = roomName;
		this.count = count;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

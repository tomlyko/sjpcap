package edu.gatech.sjpcap;

public class TCPPacket extends IPPacket{

    public TCPPacket(IPPacket packet, long packetSize){
	super(packet.timestamp, packetSize);
	
	this.src_ip = packet.src_ip;
	this.dst_ip = packet.dst_ip;
    }
    
    public int src_port;
    public int dst_port;
    
    public byte[] data;
}

package edu.gatech.sjpcap;

import java.net.*;

public class IPPacket extends Packet{

    public long timestamp;
    public long packetSize;
    
    public InetAddress src_ip;
    public InetAddress dst_ip;

    public IPPacket(long timestamp, long packetSize){
	this.timestamp = timestamp;
	this.packetSize = packetSize;
    }
}

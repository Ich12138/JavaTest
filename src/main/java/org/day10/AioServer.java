package org.day10;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;

public class AioServer {
    private AsynchronousServerSocketChannel aioServeChannel;
    private int PORT = 8080;

    public AioServer() {
        try {
            aioServeChannel = AsynchronousServerSocketChannel.open();
            aioServeChannel.bind(new InetSocketAddress(PORT));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

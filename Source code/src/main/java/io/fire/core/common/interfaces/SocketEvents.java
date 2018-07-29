package io.fire.core.common.interfaces;

import io.fire.core.common.objects.BufferManager;

public interface SocketEvents {

    void onPacket(Packet packet);
    void onClose();
    void onOpen();
    BufferManager getBufferManager();

}

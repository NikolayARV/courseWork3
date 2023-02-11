package com.example.socksstorageapp.services;

import com.example.socksstorageapp.model.Color;
import com.example.socksstorageapp.model.Size;
import com.example.socksstorageapp.model.Socks;

import java.io.IOException;
import java.nio.file.Path;

public interface StorageServices {


    //Long addSocks(Color color, Size size, int cottonPart, Long quantity);

    Socks addSocks(Socks socks1, Long count);



    Long sendSocks(Socks socks1, Long count);

    Long getSocksCount(Socks socks1);


    boolean deleteSocks(Socks socks);

    Path getSocksMap() throws IOException;
}

package com.giousa.protobuftest.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/8
 * Time:下午10:06
 */

public class Player2Bytes {

    public static void main(String[] args) {
        byte[] bytes = toBytes();

        try {
            toPlayer(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Java的序列化
     * @return
     * 结果:
     * [-84, -19, 0, 5, 115, 114, 0, 35, 99, 111, 109, 46, 103, 105, 111, 117, 115, 97,
     * 46, 112, 114, 111, 116, 111, 98, 117, 102, 116, 101, 115, 116, 46, 106, 97, 118, 97, 46, 80,
     * 108, 97, 121, 101, 114, -11, 121, -35, -103, -21, 68, -124, -36, 2, 0, 4, 73, 0, 3, 97, 103,
     * 101, 74, 0, 6, 112, 108, 97, 121, 73, 100, 74, 0, 6, 115, 107, 105, 108, 108, 115, 76, 0, 4,
     * 110, 97, 109, 101, 116, 0, 18, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114,
     * 105, 110, 103, 59, 120, 112, 0, 0, 0, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 77,
     * 116, 0, 6, 103, 105, 111, 117, 115, 97]
     */
    private static byte[] toBytes(){

        try {

            Player player = new Player(23, "giousa", 333L);

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            ObjectOutputStream os = new ObjectOutputStream(byteArrayOutputStream);

            //写入对象
            os.writeObject(player);

            //获取字节数组
            byte[] bytes = byteArrayOutputStream.toByteArray();

            System.out.println("Java2Bytes:"+Arrays.toString(bytes));

            return bytes;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * java的反序列化
     * @param bs
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static void toPlayer(byte[] bs) throws IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new ByteArrayInputStream(bs));

        Player player = (Player) os.readObject();

        System.out.println(player.toString());
    }
}

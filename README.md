# ProtobufAndJava
Protobuf和Javabean，序列化和反序列化的对比

普遍意义上的Javabean，序列化后：
[-84, -19, 0, 5, 115, 114, 0, 35, 99, 111, 109, 46, 103, 105, 111, 117, 115, 97,
46, 112, 114, 111, 116, 111, 98, 117, 102, 116, 101, 115, 116, 46, 106, 97, 118, 97, 46, 80,
108, 97, 121, 101, 114, -11, 121, -35, -103, -21, 68, -124, -36, 2, 0, 4, 73, 0, 3, 97, 103,
101, 74, 0, 6, 112, 108, 97, 121, 73, 100, 74, 0, 6, 115, 107, 105, 108, 108, 115, 76, 0, 4,
110, 97, 109, 101, 116, 0, 18, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114,
105, 110, 103, 59, 120, 112, 0, 0, 0, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 77,
116, 0, 6, 103, 105, 111, 117, 115, 97]


使用Protobuf，对同一个对象序列化：
[8, -51, 2, 16, 23, 26, 6, 103, 105, 111, 117, 115, 97]

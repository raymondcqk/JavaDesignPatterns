package tech.keihong;

/**
 * 职责统一：不同类型的实现相同的职责，具体实现不同
 * 统一定义需要实现的功能
 * 三种不同类型的用户就可以分别实现自己的服务类，做到职责统一
 * 2022/08/22
 */
public interface IVideoUserService {



    String definition();

    String advertisement();
}

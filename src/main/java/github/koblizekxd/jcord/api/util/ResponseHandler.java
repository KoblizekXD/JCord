package github.koblizekxd.jcord.api.util;

@FunctionalInterface
public interface ResponseHandler  {
    void receive(String content);
}

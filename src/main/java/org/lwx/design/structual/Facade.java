package org.lwx.design.structual;

public class Facade {
    static class ComplexVideoConvert{
        void convert(String file, String format){
            System.out.println("ComplexVideoConvert convert: " + file + " to " + format);
        }
    }
    static class VideoFacade{
        private final ComplexVideoConvert complexVideoConvert;
        public VideoFacade(){
            this.complexVideoConvert = new ComplexVideoConvert();
        }
        void convert(String file, String format){
            complexVideoConvert.convert(file, format);
        }
    }
    public static void main(String[] args) {
        VideoFacade videoFacade = new VideoFacade();
        videoFacade.convert("video.mp4", "avi");
    }
}

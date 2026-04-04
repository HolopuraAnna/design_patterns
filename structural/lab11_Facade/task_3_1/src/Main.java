public class Main {

    public static void main(String[] args) {

        VideoFile videoFile = new VideoFile(
                "youtubevideo.ogg",
                new Buffer("Byte buffer of video"),
                new Buffer("Byte buffer of audio")
        );

        videoFile.play(new MPEG4CompressionCodec());  // програємо файл не правильним кодеком

        VideoConversionFacade facade = new VideoConversionFacade();
        VideoFile converted = facade.convert(videoFile, "mp4");

        converted.play(new MPEG4CompressionCodec());
    }
}

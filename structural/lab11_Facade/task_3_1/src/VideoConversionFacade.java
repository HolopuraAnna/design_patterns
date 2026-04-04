public class VideoConversionFacade {

    public VideoFile convert(VideoFile file, String format) {

        System.out.println("\n======= VideoConversionFacade: conversion started. =======");

        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        Buffer buffer = BitrateReader.read(file, sourceCodec);
        VideoFile result = BitrateReader.convert(buffer, file.getName(), destinationCodec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(result, file.getAudioBuffer());

        System.out.println("====== VideoConversionFacade: conversion completed =======\n");

        return result;
    }
}

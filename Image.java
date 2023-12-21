public class Image extends Media implements IImageStandard {
    private String imageCodec;

    public Image(String f, String iC) {
        super(f);
        imageCodec = iC;
    }

    @Override
    public String getImageCodec() {
        return "Image codec: "+imageCodec;
    }

    @Override
    public String getMediaInfo() {
        return "Image ID: "+getId()+"\nImage name: "+getFileName()+"\nImage codec: "+imageCodec;
    }
}

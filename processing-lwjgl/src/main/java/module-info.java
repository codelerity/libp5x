
module org.praxislive.libp5x.lwjgl {
    
    requires java.desktop;
    
    requires org.praxislive.libp5x.core;
    requires org.lwjgl;
    requires org.lwjgl.glfw;
    requires org.lwjgl.opengl;
    requires org.lwjgl.stb;
    
    exports processing.lwjgl;
    
}

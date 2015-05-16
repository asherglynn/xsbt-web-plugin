name := "test"

version := "0.1.0-SNAPSHOT"

enablePlugins(WebappPlugin)

webappPostProcess := {
  webappDir =>
    import com.yahoo.platform.yui.compressor.YUICompressor
    val src  = webappDir / "script.js"
    val dest = webappDir / "script-min.js"
    YUICompressor.main(Array(src.getPath, "-o", dest.getPath))
}

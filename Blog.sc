import $ivy.`com.lihaoyi::scalatags:0.9.1`, scalatags.Text.all._

interp.watch(os.pwd / "post")

val postInfo = os
  .list(os.pwd / "post")
  .map{ p =>
    val s"$prefix - $suffix.md" = p.last
    (prefix, suffix, p)
  }
  .sortBy(_._1.toInt)



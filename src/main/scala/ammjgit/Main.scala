package ammjgit

object Main extends App {
  val predef = """
  import org.eclipse.jgit.api.Git
  import java.io.File
  """
  ammonite.Main(predef = predef).run()
}

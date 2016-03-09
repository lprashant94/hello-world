
import  ord._
//Data.books.filter(b => b.author=="odersky").map(b=> b.basePrice)


//adding new line
def isort[T](xs:List[T],x:T)(implicit ord:Ord[T]):List[T] = xs match{
  case Nil => x::Nil
  case head::tail if ord.lt(x,head) => x::xs
  case 

}

def sort[T](xs:List[T])(implicit ord:Ord[T]):List[T]={
  def loop(remaining:List[T],result:List[T]):List[T]=remaining match
    {
    case Nil =>result
    case head::tail => loop (tail,isort(result,head))

  }
  loop(xs.tail,List(xs.head))
}

sort(List(6,2,5,1))
sort(List("b","s","a"))
sort(List(Option(1),None,Option(2)))
sort(List((3,"s"),(2,"b"),(1,"b")))

package GeoTrending

/**
 * Created by senthil.b on 05/06/15.
 */

class NearByLocationService {

  def findNearbyLocation(pincode: Int): List[Int] = {
    val start: Int = pincode - (pincode % 100)
    List.tabulate(100)(n => start + n)

  }


  def findNearbyLocations(pincodes:List[Int]):collection.mutable.Map[Int,List[Int]]= {
    var locationMap: collection.mutable.Map[Int, List[Int]] = collection.mutable.Map()
    for(pincode<-pincodes){
      locationMap += pincode -> findNearbyLocation(pincode)
    }
    locationMap
  }

}

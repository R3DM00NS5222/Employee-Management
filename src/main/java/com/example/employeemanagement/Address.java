package com.example.employeemanagement;

import java.util.ArrayList;
import java.util.Arrays;

public class Address {
    private int streetNumber;
    private String streetName;
    private String city;
    private String province;

    /*
    *  city list in provinces
    *
    * source: https://gist.github.com/jdewit/8755708
    */

    //Alberta
    String[] alberta = {"Airdrie"
            ,"Grande Prairie"
            ,"Red Deer"
            ,"Beaumont"
            ,"Hanna"
            ,"St. Albert"
            ,"Bonnyville"
            ,"Hinton"
            ,"Spruce Grove"
            ,"Brazeau"
            ,"Irricana"
            ,"Strathcona County"
            ,"Breton"
            ,"Lacombe"
            ,"Strathmore"
            ,"Calgary"
            ,"Leduc"
            ,"Sylvan Lake"
            ,"Camrose"
            ,"Lethbridge"
            ,"Swan Hills"
            ,"Canmore"
            ,"McLennan"
            ,"Taber"
            ,"Didzbury"
            ,"Medicine Hat"
            ,"Turner Valley"
            ,"Drayton Valley"
            ,"Olds"
            ,"Vermillion"
            ,"Edmonton"
            ,"Onoway"
            ,"Wood Buffalo"
            ,"Ft. Saskatchewan"
            ,"Provost"};

    //British Columbia
    String[] britishColumbia = {"Burnaby"
            ,"Lumby"
            ,"City of Port Moody"
            ,"Cache Creek"
            ,"Maple Ridge"
            ,"Prince George"
            ,"Castlegar"
            ,"Merritt"
            ,"Prince Rupert"
            ,"Chemainus"
            ,"Mission"
            ,"Richmond"
            ,"Chilliwack"
            ,"Nanaimo"
            ,"Saanich"
            ,"Clearwater"
            ,"Nelson"
            ,"Sooke"
            ,"Colwood"
            ,"New Westminster"
            ,"Sparwood"
            ,"Coquitlam"
            ,"North Cowichan"
            ,"Surrey"
            ,"Cranbrook"
            ,"North Vancouver"
            ,"Terrace"
            ,"Dawson Creek"
            ,"North Vancouver"
            ,"Tumbler"
            ,"Delta"
            ,"Osoyoos"
            ,"Vancouver"
            ,"Fernie"
            ,"Parksville"
            ,"Vancouver"
            ,"Invermere"
            ,"Peace River"
            ,"Vernon"
            ,"Kamloops"
            ,"Penticton"
            ,"Victoria"
            ,"Kaslo"
            ,"Port Alberni"
            ,"Whistler"
            ,"Langley"
            ,"Port Hardy"};

    //Manitoba
    String[] manitoba = {"Birtle"
            ,"Flin Flon"
            ,"Swan River"
            ,"Brandon"
            ,"Snow Lake"
            ,"The Pas"
            ,"Cranberry Portage"
            ,"Steinbach"
            ,"Thompson"
            ,"Dauphin"
            ,"Stonewall"
            ,"Winnipeg"};

    //New Burnswick
    String[] newBurnswick = {"Cap-Pele"
            ,"Miramichi"
            ,"Saint John"
            ,"Fredericton"
            ,"Moncton"
            ,"Saint Stephen"
            ,"Grand Bay-Westfield"
            ,"Oromocto"
            ,"Shippagan"
            ,"Grand Falls"
            ,"Port Elgin"
            ,"Sussex"
            ,"Memramcook"
            ,"Sackville"
            ,"Tracadie-Sheila"};

    //Newfoundland and Labrador
    String[] newFoundlandAndLabrador = {"Argentia"
            ,"Corner Brook"
            ,"Paradise"
            ,"Bishop's Falls"
            ,"Labrador City"
            ,"Portaux Basques"
            ,"Botwood"
            ,"Mount Pearl"
            ,"St. John's"
            ,"Brigus"};

    //Northwest Territories
    String[] northwestTerritories = {
            "Town of Hay River"
            ,"Town of Inuvik"
            ,"Yellowknife"};

    //Nova Scotia
    String[] novaScotia = {"Amherst"
            ,"Hants County"
            ,"Pictou"
            ,"Annapolis"
            ,"Inverness County"
            ,"Pictou County"
            ,"Argyle"
            ,"Kentville"
            ,"Queens"
            ,"Baddeck"
            ,"County of Kings"
            ,"Richmond"
            ,"Bridgewater"
            ,"Lunenburg"
            ,"Shelburne"
            ,"Cape Breton"
            ,"Lunenburg County"
            ,"Stellarton"
            ,"Chester"
            ,"Mahone Bay"
            ,"Truro"
            ,"Cumberland County"
            ,"New Glasgow"
            ,"Windsor"
            ,"East Hants"
            ,"New Minas"
            ,"Yarmouth"
            ,"Halifax"
            ,"Parrsboro"};

    //Nunavut
    String[] nunavut = {"Iqaluit"}; //only one city sed ;;;

    //Ontario
    String[] ontario = {
            "Halton"
            , "Peterborough"
            , "Atikokan"
            , "Halton Hills"
            , "Pickering"
            , "Barrie"
            , "Hamilton"
            , "Port Bruce"
            , "Belleville"
            , "Hamilton-Wentworth"
            , "Port Burwell"
            , "Blandford-Blenheim"
            , "Hearst"
            , "Port Colborne"
            , "Blind River"
            , "Huntsville"
            , "Port Hope"
            , "Brampton"
            , "Ingersoll"
            , "Prince Edward"
            , "Brant"
            , "James"
            , "Quinte West"
            , "Brantford"
            , "Kanata"
            , "Renfrew"
            , "Brock"
            , "Kincardine"
            , "Richmond Hill"
            , "Brockville"
            , "King"
            , "Sarnia"
            , "Burlington"
            , "Kingston"
            , "Sault Ste. Marie"
            , "Caledon"
            , "Kirkland Lake"
            , "Scarborough"
            , "Cambridge"
            , "Kitchener"
            , "Scugog"
            , "Chatham-Kent"
            , "Larder Lake"
            , "Souix Lookout CoC Sioux Lookout"
            , "Chesterville"
            , "Leamington"
            , "Smiths Falls"
            , "Clarington"
            , "Lennox-Addington"
            , "South-West Oxford"
            , "Cobourg"
            , "Lincoln"
            , "St. Catharines"
            , "Cochrane"
            , "Lindsay"
            , "St. Thomas"
            , "Collingwood"
            , "London"
            , "Stoney Creek"
            , "Cornwall"
            , "Loyalist Township"
            , "Stratford"
            , "Cumberland"
            , "Markham"
            , "Sudbury"
            , "Deep River"
            , "Metro Toronto"
            , "Temagami"
            , "Dundas"
            , "Merrickville"
            , "Thorold"
            , "Durham"
            , "Milton"
            , "Thunder Bay"
            , "Dymond"
            , "Nepean"
            , "Tillsonburg"
            , "Ear Falls"
            , "Newmarket"
            , "Timmins"
            , "East Gwillimbury"
            , "Niagara"
            , "Toronto"
            , "East Zorra-Tavistock"
            , "Niagara Falls"
            , "Uxbridge"
            , "Elgin"
            , "Niagara-on-the-Lake"
            , "Vaughan"
            , "Elliot Lake"
            , "North Bay"
            , "Wainfleet"
            , "Flamborough"
            , "North Dorchester"
            , "Wasaga Beach"
            , "Fort Erie"
            , "North Dumfries"
            , "Waterloo"
            , "Fort Frances"
            , "North York"
            , "Waterloo"
            , "Gananoque"
            , "Norwich"
            , "Welland"
            , "Georgina"
            , "Oakville"
            , "Wellesley"
            , "Glanbrook"
            , "Orangeville"
            , "West Carleton"
            , "Gloucester"
            , "Orillia"
            , "West Lincoln"
            , "Goulbourn"
            , "Osgoode"
            , "Whitby"
            , "Gravenhurst"
            , "Oshawa"
            , "Wilmot"
            , "Grimsby"
            , "Ottawa"
            , "Windsor"
            , "Guelph"
            , "Ottawa-Carleton"
            , "Woolwich"
            , "Haldimand-Norfork"
            , "Owen Sound"
            , "York"
    };

    //Prince Edward Island
    String[] princeEdwardIsland = {
            "Alberton"
            ,"Montague"
            ,"Stratford"
            ,"Charlottetown"
            ,"Souris"
            ,"Summerside"
            ,"Cornwall"
    };

    //Quebec
    String[] quebec = {
            "Alma"
            ,"Fleurimont"
            ,"Longueuil"
            ,"Amos"
            ,"Gaspe"
            ,"Marieville"
            ,"Anjou"
            ,"Gatineau"
            ,"Mount Royal"
            ,"Aylmer"
            ,"Hull"
            ,"Montreal"
            ,"Beauport"
            ,"Joliette"
            ,"Montreal Region"
            ,"Bromptonville"
            ,"Jonquiere"
            ,"Montreal-Est"
            ,"Brosssard"
            ,"Lachine"
            ,"Quebec"
            ,"Chateauguay"
            ,"Lasalle"
            ,"Saint-Leonard"
            ,"Chicoutimi"
            ,"Laurentides"
            ,"Sherbrooke"
            ,"Coaticook"
            ,"LaSalle"
            ,"Sorel"
            ,"Coaticook"
            ,"Laval"
            ,"Thetford Mines"
            ,"Dorval"
            ,"Lennoxville"
            ,"Victoriaville"
            ,"Drummondville"
            ,"Levis"
    };

    //Saskatchewan
    String[] saskatchewan = {
            "Avonlea"
            ,"Melfort"
            ,"Swift Current"
            ,"Colonsay"
            ,"Nipawin"
            ,"Tisdale"
            ,"Craik"
            ,"Prince Albert"
            ,"Unity"
            ,"Creighton"
            ,"Regina"
            ,"Weyburn"
            ,"Eastend"
            ,"Saskatoon"
            ,"Wynyard"
            ,"Esterhazy"
            ,"Shell Lake"
            ,"Yorkton"
            ,"Gravelbourg"
    };

    //Yukon
    String[] yukon = {
            "Carcross"
            ,"Whitehorse"
    };

    //array of provinces
    String[] provinces = {"Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador", "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan", "Yukon Territory"};

    public Address(int streetNumber, String streetName, String city, String province) {
        setStreetNumber(streetNumber);
        this.streetName = streetName;
        this.city = city;
        this.province = province;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        if (streetNumber < 1000000 && streetNumber >= 0){
            //because 986039 Oxford-Perth Road is the largest street number.
            this.streetNumber = streetNumber;
        }
        else {
            throw new IllegalArgumentException("Please enter a valid street number!");
        }
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        //street name length set to a minimum of 2 because of Rh Way in Winnipeg.
        if (streetName.trim().length() >=2){
            this.streetName = streetName;
        }
        else {
            throw new IllegalArgumentException("Please Enter a valid street name!");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        if (Arrays.asList(provinces).contains(province)){
            this.province = province;
        }
        else {
            throw new IllegalArgumentException("Please enter a valid Province in Canada!");
        }
    }
}

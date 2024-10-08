package com.sebasgrdev.freetoplaygameswiki.ui.navigation

sealed class GameCategory(val route: String) {
    object Popular : GameCategory("popular")
    object All : GameCategory("all")
    object Release : GameCategory("release")
    object Pc : GameCategory("pc")
    object Browser : GameCategory("browser")
    object Mmorpg : GameCategory("mmorpg")
    object Shooter : GameCategory("shooter")
    object Strategy : GameCategory("strategy")
    object Moba : GameCategory("moba")
    object Racing : GameCategory("racing")
    object Sports : GameCategory("sports")
    object Social : GameCategory("social")
    object Sandbox : GameCategory("sandbox")
    object OpenWorld : GameCategory("open-world")
    object Survival : GameCategory("survival")
    object Pvp : GameCategory("pvp")
    object Pve : GameCategory("pve")
    object Pixel : GameCategory("pixel")
    object Voxel : GameCategory("voxel")
    object Zombie : GameCategory("zombie")
    object TurnBased : GameCategory("turn-based")
    object FirstPerson : GameCategory("first-person")
    object ThirdPerson : GameCategory("third-Person")
    object TopDown : GameCategory("top-down")
    object Tank : GameCategory("tank")
    object Space : GameCategory("space")
    object Sailing : GameCategory("sailing")
    object SideScroller : GameCategory("side-scroller")
    object Superhero : GameCategory("superhero")
    object Permadeath : GameCategory("permadeath")
    object Card : GameCategory("card")
    object BattleRoyale : GameCategory("battle-royale")
    object Mmo : GameCategory("mmo")
    object Mmofps : GameCategory("mmofps")
    object Mmotps : GameCategory("mmotps")
    object ThreeD : GameCategory("3d") // Use ThreeD instead of 3d
    object TwoD : GameCategory("2d")    // Use TwoD instead of 2d
    object Anime : GameCategory("anime")
    object Fantasy : GameCategory("fantasy")
    object SciFi : GameCategory("sci-fi")
    object Fighting : GameCategory("fighting")
    object ActionRpg : GameCategory("action-rpg")
    object Action : GameCategory("action")
    object Military : GameCategory("military")
    object MartialArts : GameCategory("martial-arts")
    object Flight : GameCategory("flight")
    object LowSpec : GameCategory("low-spec")
    object TowerDefense : GameCategory("tower-defense")
    object Horror : GameCategory("horror")
    object Mmorts : GameCategory("mmorts")
}
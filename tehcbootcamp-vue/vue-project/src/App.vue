<script>
  import SelectorMenu from './components/SelectorMenu.vue'
  import Output from './components/Output.vue'

  export default {
    components: {
      SelectorMenu,
      Output
    },
    data() {
      return {
        selects: 
        [
          {
            label: "Player",
            options:
            [
              "XXLozengeXX", "Giant Arms NA", "CrazedPanda", "Slipp3ryMonk3y"
            ]
          },
          {
            label: "Map",
            options:
            [
              "Breeze"
            ]
          },
          {
            label: "Side",
            options:
            [
              "All",
              "Defense",
              "Attack"
            ]
          },
          {
            label: "Weapon",
            options:
            [
              "All",
              "Vandal",
              "Phantom",
              "Operator",
              "Classic",
              "Sherrif",
              "Frenzy",
              "Ares",
              "Marshal"
            ]
          }
        ],
        headers: ["Callout", "Kills", "Deaths", "K/D"],
        data:
        [
          ["Rope", 3, 2, 3/2],
          ["stairs", 7, 1, 1.5],
          ["lobby", 1, 2, 0],
          ["main", 9, 5, "test"]
        ]
      }
    },
    methods: {
      fetchDatas() {
        fetch("http://localhost:8080/KillEvent/XXLozengeXX/breeze/all/all")
          .then(console.log(response))
          .then(
            console.log(response)
          )
      },
      async fetchData()
      {
        try {
          const res = await fetch(`http://localhost:8080/KillEvent/Giant Arms NA/breeze/all/all`);
          if (!res.ok) {
            const message = `An error has occured: ${res.status} - ${res.statusText}`;
            throw new Error(message);
          }
          const data = await res.json();
          const result = {
            status: res.status + "-" + res.statusText,
            headers: {
              "Content-Type": res.headers.get("Content-Type"),
              "Content-Length": res.headers.get("Content-Length"),
            },
            length: res.headers.get("Content-Length"),
            data: data,
          };
          console.log(result);
          this.data = result.data;
        }
        catch (err) {
          console.log(err.message);
        }
      }
    }
  }
</script>

<template>
  <div id="container">
    <SelectorMenu :selects="selects" />
    <button @click="this.fetchData()"> Submit </button>
    <Output :headers="headers" :data="data" />
    <div id="imgdiv">
      <img id="map" src="./assets/breezecalls.png" />
    </div>
  </div>
</template>

<style>
@import "@/assets/base.css";

  #map {
    position: sticky;
    top: 10px;
    width: 95vh;
  }

  #imgdiv {
    position: fixed;
    top: 30px;
    right: 0px;
  }
</style>

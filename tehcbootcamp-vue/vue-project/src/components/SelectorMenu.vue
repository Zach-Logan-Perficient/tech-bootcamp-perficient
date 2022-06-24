<script>
import Selector from './Selector.vue'

export default {
  components: {
    Selector
  },
  props: {
    selects: Array
  }
}
</script>

<template>
    <Selector class="selector" v-for="(select, index) in selects" :key="index" :label="select.label" :options="select.options" />
</template>

<style>
    .selector {
        display: inline;
        padding-right: 10px;
        padding-bottom: 10px;
    }
</style>
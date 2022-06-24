<script>
export default {
  props: {
    label: String,
    options: Array
  },
  data() {
    return {
        choice: this.options[0]
    }
  }
}
</script>

<template>
    <div>
        <span>{{label}}</span>
        <select :name="label" :id="label" v-model="choice">
            <option v-for="(option, index) in options" :key="index" :value="option">{{option}}</option>
        </select>
    </div>
</template>

<style>
    
</style>
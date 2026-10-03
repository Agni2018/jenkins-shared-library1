def call() {

    echo 'Deployment stage started...'
    echo 'Pulling latest image from Docker Hub...'

    sh 'docker compose pull'

    echo 'Starting application...'

    sh 'docker compose up -d'

    echo 'Deployment successful!'
}

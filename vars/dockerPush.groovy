def call(String imageName, String credentialsId) {

    echo 'Push to Docker Hub stage started...'

    withCredentials([
        usernamePassword(
            credentialsId: credentialsId,
            usernameVariable: 'DOCKER_USERNAME',
            passwordVariable: 'DOCKER_PASSWORD'
        )
    ]) {

        sh '''
            echo "$DOCKER_PASSWORD" | docker login \
                -u "$DOCKER_USERNAME" \
                --password-stdin

            docker push $IMAGE_NAME:$BUILD_NUMBER
            docker push $IMAGE_NAME:latest

            docker logout
        '''
    }

    echo 'Docker image pushed to Docker Hub successfully!'
}
